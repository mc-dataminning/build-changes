import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record xw(String b, Instant c, long d, xk e) {
   public static final MapCodec<xw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(xw::a),
               ayl.o.fieldOf("time_stamp").forGetter(xw::b),
               Codec.LONG.fieldOf("salt").forGetter(xw::c),
               xk.a.optionalFieldOf("last_seen", xk.b).forGetter(xw::d)
            )
            .apply($$0, xw::new)
   );

   public static xw a(String $$0) {
      return new xw($$0, Instant.now(), 0L, xk.b);
   }

   public void a(azo.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public xw.a a(xq $$0) {
      return new xw.a(this.b, this.c, this.d, this.e.a($$0));
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

   public xk d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, xk.a d) {
      public a(wa $$0) {
         this($$0.d(256), $$0.t(), $$0.readLong(), new xk.a($$0));
      }

      public void a(wa $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<xw> a(xq $$0) {
         return this.d.a($$0).map($$0x -> new xw(this.a, this.b, this.c, $$0x));
      }
   }
}
