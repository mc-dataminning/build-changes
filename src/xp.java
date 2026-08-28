import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record xp(String b, Instant c, long d, xd e) {
   public static final MapCodec<xp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(xp::a),
               ays.q.fieldOf("time_stamp").forGetter(xp::b),
               Codec.LONG.fieldOf("salt").forGetter(xp::c),
               xd.a.optionalFieldOf("last_seen", xd.b).forGetter(xp::d)
            )
            .apply($$0, xp::new)
   );

   public static xp a(String $$0) {
      return new xp($$0, Instant.now(), 0L, xd.b);
   }

   public void a(azy.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public xp.a a(xj $$0) {
      return new xp.a(this.b, this.c, this.d, this.e.a($$0));
   }

   public String a() {
      return this.b;
   }

   public Instant b() {
      return this.c;
   }

   public long c() {
      return this.d;
   }

   public xd d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, xd.a d) {
      public a(vs $$0) {
         this($$0.d(256), $$0.t(), $$0.readLong(), new xd.a($$0));
      }

      public void a(vs $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<xp> a(xj $$0) {
         return this.d.a($$0).map($$0x -> new xp(this.a, this.b, this.c, $$0x));
      }
   }
}
