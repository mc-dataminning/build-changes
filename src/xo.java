import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record xo(String b, Instant c, long d, xc e) {
   public static final MapCodec<xo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(xo::a),
               ays.q.fieldOf("time_stamp").forGetter(xo::b),
               Codec.LONG.fieldOf("salt").forGetter(xo::c),
               xc.a.optionalFieldOf("last_seen", xc.b).forGetter(xo::d)
            )
            .apply($$0, xo::new)
   );

   public static xo a(String $$0) {
      return new xo($$0, Instant.now(), 0L, xc.b);
   }

   public void a(azw.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public xo.a a(xi $$0) {
      return new xo.a(this.b, this.c, this.d, this.e.a($$0));
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

   public xc d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, xc.a d) {
      public a(vr $$0) {
         this($$0.d(256), $$0.t(), $$0.readLong(), new xc.a($$0));
      }

      public void a(vr $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<xo> a(xi $$0) {
         return this.d.a($$0).map($$0x -> new xo(this.a, this.b, this.c, $$0x));
      }
   }
}
