package net.minecraft.util.crypto;

import com.google.common.primitives.Bytes;
import com.google.common.primitives.Longs;
import io.netty.channel.ChannelId;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.NamedParameterSpec;
import javax.crypto.KDF;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.HKDFParameterSpec;
import javax.crypto.spec.HKDFParameterSpec.Builder;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Util;

public class SessionKeyExchange {
   public static final SessionKeyExchange.Side DEFAULT_CLIENT_SIDE = SessionKeyExchange.Side.B;
   public static final SessionKeyExchange.Side DEFAULT_SERVER_SIDE = SessionKeyExchange.Side.A;
   private static final byte[] SALT = Bytes.concat(
      new byte[][]{Longs.toByteArray(3195254534265565831L), Longs.toByteArray(8302438179253405948L), Longs.toByteArray(6794457759077931664L)}
   );
   private static final String KEY_ALGORITHM = "XDH";
   private static final String KEY_ENCHANGE_ALGORITHM = "XDH";
   public static final String INTEGRITY_SIGNATURE_ALGORITHM = "HmacSHA256";
   public static final int INTEGRITY_SIGNATURE_KEY_SIZE = 256;
   private static final NamedParameterSpec EC_CURVE = NamedParameterSpec.X25519;
   private final SessionCommonInfo commonInfo;
   private final String ownName;
   private final SessionKeyExchange.Side ownSide;
   private final KeyPair ownKeyPair;

   public SessionKeyExchange(final SessionCommonInfo commonInfo, final SessionKeyExchange.Side ownSide, final String ownName, final KeyPair ownKeyPair) {
      this.commonInfo = commonInfo;
      this.ownSide = ownSide;
      this.ownName = ownName;
      this.ownKeyPair = ownKeyPair;
   }

   public static KeyPair createKeyPair(final SecureRandom random) {
      try {
         KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("XDH");
         keyPairGenerator.initialize(EC_CURVE, random);
         return keyPairGenerator.generateKeyPair();
      } catch (Exception e) {
         throw new UnsupportedOperationException(e);
      }
   }

   public SessionCommonInfo commonInfo() {
      return this.commonInfo;
   }

   public PublicKey publicKey() {
      return this.ownKeyPair.getPublic();
   }

   public SessionKeys createSessionKeys(final PublicPeerInfo peerInfo) {
      PublicPeerInfo ownInfo = new PublicPeerInfo(this.ownKeyPair.getPublic(), this.ownName);
      if (peerInfo.publicKey().getParams() instanceof NamedParameterSpec namedParameterSpec && namedParameterSpec.getName().equals(EC_CURVE.getName())) {
         PublicPeerInfo peerAInfo = this.pickA(ownInfo, peerInfo);
         PublicPeerInfo peerBInfo = this.pickB(ownInfo, peerInfo);
         String connectionParams = this.connectionParams(peerAInfo, peerBInfo);
         String authParams = this.authParams(peerAInfo, peerBInfo);

         try {
            KeyAgreement keyAgreement = KeyAgreement.getInstance("XDH");
            keyAgreement.init(this.ownKeyPair.getPrivate(), EC_CURVE);
            keyAgreement.doPhase(peerInfo.publicKey(), true);
            byte[] sharedSecret = keyAgreement.generateSecret();
            KDF kdf = KDF.getInstance("HKDF-SHA256");
            Builder kdfExtract = HKDFParameterSpec.ofExtract().addIKM(sharedSecret).addSalt(Longs.toByteArray(this.commonInfo.salt())).addSalt(SALT);
            SecretKey aToB = kdf.deriveKey("AES", kdfExtract.thenExpand(("a_to_b;" + connectionParams).getBytes(StandardCharsets.UTF_8), 16));
            SecretKey bToA = kdf.deriveKey("AES", kdfExtract.thenExpand(("b_to_a;" + connectionParams).getBytes(StandardCharsets.UTF_8), 16));
            SecretKey authSignatureKey = kdf.deriveKey("HmacSHA256", kdfExtract.thenExpand(("authenticate;" + authParams).getBytes(StandardCharsets.UTF_8), 32));
            SecretKey integritySignatureKey = kdf.deriveKey("HmacSHA256", kdfExtract.thenExpand(("verify;" + authParams).getBytes(StandardCharsets.UTF_8), 32));
            return new SessionKeys(this.commonInfo, peerAInfo, peerBInfo, aToB, bToA, authSignatureKey, integritySignatureKey);
         } catch (GeneralSecurityException e) {
            throw new UnsupportedOperationException(e);
         }
      } else {
         throw new UnsupportedOperationException("Wrong curve parameters");
      }
   }

   private String connectionParams(final PublicPeerInfo peerA, final PublicPeerInfo peerB) {
      return "a=" + peerA.name() + ";b=" + peerB.name() + ";protocol=" + this.commonInfo.protocolVersion();
   }

   private String authParams(final PublicPeerInfo peerA, final PublicPeerInfo peerB) {
      return "a=" + peerA.name() + ";b=" + peerB.name();
   }

   private <T> T pickA(final T self, final T peer) {
      return (T)(switch (this.ownSide) {
         case A -> self;
         case B -> peer;
      });
   }

   private <T> T pickB(final T self, final T peer) {
      return (T)(switch (this.ownSide) {
         case A -> peer;
         case B -> self;
      });
   }

   public static SessionKeyExchange createClientSide(final String clientName, final int protocolVersion, final long salt, final boolean authenticationRequested) {
      SessionCommonInfo info = new SessionCommonInfo(protocolVersion, salt, authenticationRequested);
      SecureRandom random = new SecureRandom();
      return new SessionKeyExchange(info, DEFAULT_CLIENT_SIDE, clientName, createKeyPair(random));
   }

   public static class ServerSideFactory {
      private final SecureRandom secureRandom;
      private RandomSource random;
      private KeyPair keyPair;
      private long lastRekeyTimeMs;
      private final long minRekeyTimeMs;

      public ServerSideFactory(final SecureRandom secureRandom, final long minRekeyTimeMs) {
         this.secureRandom = secureRandom;
         this.minRekeyTimeMs = minRekeyTimeMs;
         this.rekey();
      }

      private void rekey() {
         this.random = RandomSource.createThreadLocalInstance(this.secureRandom.nextLong());
         this.keyPair = SessionKeyExchange.createKeyPair(this.secureRandom);
         this.lastRekeyTimeMs = Util.getMillis();
      }

      private void rekeyIfNeeded() {
         if (this.minRekeyTimeMs == 0L) {
            this.rekey();
         } else {
            long currentTime = Util.getMillis();
            if (currentTime - this.lastRekeyTimeMs > this.minRekeyTimeMs) {
               this.rekey();
            }
         }
      }

      public SessionKeyExchange createServerSide(
         final ChannelId channelId, final String serverName, final int protocolVersion, final boolean authenticationRequested
      ) {
         this.rekeyIfNeeded();
         long salt = this.nextNonce(channelId);
         SessionCommonInfo info = new SessionCommonInfo(protocolVersion, salt, authenticationRequested);
         return this.createExchange(info, serverName);
      }

      private SessionKeyExchange createExchange(final SessionCommonInfo sessionCommonInfo, final String serverName) {
         return new SessionKeyExchange(sessionCommonInfo, SessionKeyExchange.DEFAULT_SERVER_SIDE, serverName, this.keyPair);
      }

      private long nextNonce(final ChannelId channelId) {
         long originalSeed = this.random.nextLong();
         return originalSeed + channelId.hashCode();
      }
   }

   public enum Side {
      A,
      B;
   }
}
