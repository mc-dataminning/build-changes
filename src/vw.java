import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record vw(String b, Instant c, long d, vk e) {
   public static final MapCodec<vw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(vw::a),
               atq.m.fieldOf("time_stamp").forGetter(vw::b),
               Codec.LONG.fieldOf("salt").forGetter(vw::c),
               vk.a.optionalFieldOf("last_seen", vk.b).forGetter(vw::d)
            )
            .apply($$0, vw::new)
   );

   public static vw a(String $$0) {
      return new vw($$0, Instant.now(), 0L, vk.b);
   }

   public void a(auu.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public vw.a a(vq $$0) {
      return new vw.a(this.b, this.c, this.d, this.e.a($$0));
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

   public vk d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, vk.a d) {
      public a(ug $$0) {
         this($$0.d(256), $$0.w(), $$0.readLong(), new vk.a($$0));
      }

      public void a(ug $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<vw> a(vq $$0) {
         return this.d.a($$0).map($$0x -> new vw(this.a, this.b, this.c, $$0x));
      }
   }
}
