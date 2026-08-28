import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record ye(String b, Instant c, long d, xs e) {
   public static final MapCodec<ye> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(ye::a),
               ayc.o.fieldOf("time_stamp").forGetter(ye::b),
               Codec.LONG.fieldOf("salt").forGetter(ye::c),
               xs.a.optionalFieldOf("last_seen", xs.b).forGetter(ye::d)
            )
            .apply($$0, ye::new)
   );

   public static ye a(String $$0) {
      return new ye($$0, Instant.now(), 0L, xs.b);
   }

   public void a(azg.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public ye.a a(xy $$0) {
      return new ye.a(this.b, this.c, this.d, this.e.a($$0));
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

   public xs d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, xs.a d) {
      public a(wl $$0) {
         this($$0.d(256), $$0.t(), $$0.readLong(), new xs.a($$0));
      }

      public void a(wl $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<ye> a(xy $$0) {
         return this.d.a($$0).map($$0x -> new ye(this.a, this.b, this.c, $$0x));
      }
   }
}
