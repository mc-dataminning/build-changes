import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record xx(String b, Instant c, long d, xl e) {
   public static final MapCodec<xx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(xx::a),
               axu.m.fieldOf("time_stamp").forGetter(xx::b),
               Codec.LONG.fieldOf("salt").forGetter(xx::c),
               xl.a.optionalFieldOf("last_seen", xl.b).forGetter(xx::d)
            )
            .apply($$0, xx::new)
   );

   public static xx a(String $$0) {
      return new xx($$0, Instant.now(), 0L, xl.b);
   }

   public void a(ayx.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public xx.a a(xr $$0) {
      return new xx.a(this.b, this.c, this.d, this.e.a($$0));
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

   public xl d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, xl.a d) {
      public a(we $$0) {
         this($$0.d(256), $$0.t(), $$0.readLong(), new xl.a($$0));
      }

      public void a(we $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<xx> a(xr $$0) {
         return this.d.a($$0).map($$0x -> new xx(this.a, this.b, this.c, $$0x));
      }
   }
}
