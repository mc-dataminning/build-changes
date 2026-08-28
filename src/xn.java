import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record xn(String b, Instant c, long d, xb e) {
   public static final MapCodec<xn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(xn::a),
               axm.o.fieldOf("time_stamp").forGetter(xn::b),
               Codec.LONG.fieldOf("salt").forGetter(xn::c),
               xb.a.optionalFieldOf("last_seen", xb.b).forGetter(xn::d)
            )
            .apply($$0, xn::new)
   );

   public static xn a(String $$0) {
      return new xn($$0, Instant.now(), 0L, xb.b);
   }

   public void a(ayq.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public xn.a a(xh $$0) {
      return new xn.a(this.b, this.c, this.d, this.e.a($$0));
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

   public xb d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, xb.a d) {
      public a(vr $$0) {
         this($$0.d(256), $$0.t(), $$0.readLong(), new xb.a($$0));
      }

      public void a(vr $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<xn> a(xh $$0) {
         return this.d.a($$0).map($$0x -> new xn(this.a, this.b, this.c, $$0x));
      }
   }
}
