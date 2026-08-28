import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record xv(String b, Instant c, long d, xj e) {
   public static final MapCodec<xv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(xv::a),
               ayy.q.fieldOf("time_stamp").forGetter(xv::b),
               Codec.LONG.fieldOf("salt").forGetter(xv::c),
               xj.a.optionalFieldOf("last_seen", xj.b).forGetter(xv::d)
            )
            .apply($$0, xv::new)
   );

   public static xv a(String $$0) {
      return new xv($$0, Instant.now(), 0L, xj.b);
   }

   public void a(bae.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public xv.a a(xp $$0) {
      return new xv.a(this.b, this.c, this.d, this.e.a($$0));
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

   public xj d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, xj.a d) {
      public a(vy $$0) {
         this($$0.d(256), $$0.t(), $$0.readLong(), new xj.a($$0));
      }

      public void a(vy $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<xv> a(xp $$0) {
         return this.d.a($$0).map($$0x -> new xv(this.a, this.b, this.c, $$0x));
      }
   }
}
