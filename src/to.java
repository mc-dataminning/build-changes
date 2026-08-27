import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record to(String b, Instant c, long d, tc e) {
   public static final MapCodec<to> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(to::a),
               aoi.m.fieldOf("time_stamp").forGetter(to::b),
               Codec.LONG.fieldOf("salt").forGetter(to::c),
               tc.a.optionalFieldOf("last_seen", tc.b).forGetter(to::d)
            )
            .apply($$0, to::new)
   );

   public static to a(String $$0) {
      return new to($$0, Instant.now(), 0L, tc.b);
   }

   public void a(api.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public to.a a(ti $$0) {
      return new to.a(this.b, this.c, this.d, this.e.a($$0));
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

   public tc d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, tc.a d) {
      public a(sf $$0) {
         this($$0.e(256), $$0.v(), $$0.readLong(), new tc.a($$0));
      }

      public void a(sf $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.writeLong(this.c);
         this.d.a($$0);
      }

      public Optional<to> a(ti $$0) {
         return this.d.a($$0).map($$0x -> new to(this.a, this.b, this.c, $$0x));
      }
   }
}
