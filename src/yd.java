import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record yd(String b, Instant c, long d, xr e) {
   public static final MapCodec<yd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(yd::a),
               azd.q.fieldOf("time_stamp").forGetter(yd::b),
               Codec.LONG.fieldOf("salt").forGetter(yd::c),
               xr.a.optionalFieldOf("last_seen", xr.b).forGetter(yd::d)
            )
            .apply($$0, yd::new)
   );

   public static yd a(String $$0) {
      return new yd($$0, Instant.now(), 0L, xr.b);
   }

   public void a(bag.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public yd.a a(xx $$0) {
      return new yd.a(this.b, this.c, this.d, this.e.a($$0));
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

   public xr d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, xr.a d) {
      public a(wh $$0) {
         this($$0.d(256), $$0.t(), $$0.readLong(), new xr.a($$0));
      }

      public void a(wh $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<yd> a(xx $$0) {
         return this.d.a($$0).map($$0x -> new yd(this.a, this.b, this.c, $$0x));
      }
   }
}
