import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record xr(String b, Instant c, long d, xf e) {
   public static final MapCodec<xr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(xr::a),
               ayu.q.fieldOf("time_stamp").forGetter(xr::b),
               Codec.LONG.fieldOf("salt").forGetter(xr::c),
               xf.a.optionalFieldOf("last_seen", xf.b).forGetter(xr::d)
            )
            .apply($$0, xr::new)
   );

   public static xr a(String $$0) {
      return new xr($$0, Instant.now(), 0L, xf.b);
   }

   public void a(baa.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public xr.a a(xl $$0) {
      return new xr.a(this.b, this.c, this.d, this.e.a($$0));
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

   public xf d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, xf.a d) {
      public a(vu $$0) {
         this($$0.d(256), $$0.t(), $$0.readLong(), new xf.a($$0));
      }

      public void a(vu $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<xr> a(xl $$0) {
         return this.d.a($$0).map($$0x -> new xr(this.a, this.b, this.c, $$0x));
      }
   }
}
