import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record vz(String b, Instant c, long d, vn e) {
   public static final MapCodec<vz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(vz::a),
               atx.m.fieldOf("time_stamp").forGetter(vz::b),
               Codec.LONG.fieldOf("salt").forGetter(vz::c),
               vn.a.optionalFieldOf("last_seen", vn.b).forGetter(vz::d)
            )
            .apply($$0, vz::new)
   );

   public static vz a(String $$0) {
      return new vz($$0, Instant.now(), 0L, vn.b);
   }

   public void a(avc.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public vz.a a(vt $$0) {
      return new vz.a(this.b, this.c, this.d, this.e.a($$0));
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

   public vn d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, vn.a d) {
      public a(uj $$0) {
         this($$0.d(256), $$0.w(), $$0.readLong(), new vn.a($$0));
      }

      public void a(uj $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<vz> a(vt $$0) {
         return this.d.a($$0).map($$0x -> new vz(this.a, this.b, this.c, $$0x));
      }
   }
}
