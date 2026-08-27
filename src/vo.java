import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record vo(String b, Instant c, long d, vc e) {
   public static final MapCodec<vo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(vo::a),
               asy.m.fieldOf("time_stamp").forGetter(vo::b),
               Codec.LONG.fieldOf("salt").forGetter(vo::c),
               vc.a.optionalFieldOf("last_seen", vc.b).forGetter(vo::d)
            )
            .apply($$0, vo::new)
   );

   public static vo a(String $$0) {
      return new vo($$0, Instant.now(), 0L, vc.b);
   }

   public void a(aub.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public vo.a a(vi $$0) {
      return new vo.a(this.b, this.c, this.d, this.e.a($$0));
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

   public vc d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, vc.a d) {
      public a(ty $$0) {
         this($$0.d(256), $$0.w(), $$0.readLong(), new vc.a($$0));
      }

      public void a(ty $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<vo> a(vi $$0) {
         return this.d.a($$0).map($$0x -> new vo(this.a, this.b, this.c, $$0x));
      }
   }
}
