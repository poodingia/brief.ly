import { useEffect } from "react";
import { useParams, useNavigate } from "react-router-dom";

function Redirect() {
    const { shortenedKey } = useParams();
    const navigate = useNavigate();
    const serverUrl = import.meta.env.VITE_SERVER_URL;
    const resolveApi = `${serverUrl}/api/url/short`;
  
    useEffect(() => {
      const getOriginalUrl = async () => {
        window.location.href = `${resolveApi}/${shortenedKey}`;
      };
  
      if (shortenedKey) {
        getOriginalUrl();
      }
    }, [shortenedKey, navigate, resolveApi]);
  
    return (
      <div style={{ textAlign: 'center', marginTop: '20%' }}>
        <h2>Redirecting...</h2>
      </div>
    );
}

export default Redirect;