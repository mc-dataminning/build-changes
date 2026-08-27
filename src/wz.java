import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record wz(String b, Instant c, long d, wn e) {
   public static final MapCodec<wz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(wz::a),
               aws.m.fieldOf("time_stamp").forGetter(wz::b),
               Codec.LONG.fieldOf("salt").forGetter(wz::c),
               wn.a.optionalFieldOf("last_seen", wn.b).forGetter(wz::d)
            )
            .apply($$0, wz::new)
   );

   public static wz a(String $$0) {
      return new wz($$0, Instant.now(), 0L, wn.b);
   }

   public void a(axv.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public wz.a a(wt $$0) {
      return new wz.a(this.b, this.c, this.d, this.e.a($$0));
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

   public wn d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, wn.a d) {
      public a(vg $$0) {
         this($$0.d(256), $$0.t(), $$0.readLong(), new wn.a($$0));
      }

      public void a(vg $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<wz> a(wt $$0) {
         return this.d.a($$0).map($$0x -> new wz(this.a, this.b, this.c, $$0x));
      }
   }
}
