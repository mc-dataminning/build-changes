import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record vy(String b, Instant c, long d, vm e) {
   public static final MapCodec<vy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(vy::a),
               atw.m.fieldOf("time_stamp").forGetter(vy::b),
               Codec.LONG.fieldOf("salt").forGetter(vy::c),
               vm.a.optionalFieldOf("last_seen", vm.b).forGetter(vy::d)
            )
            .apply($$0, vy::new)
   );

   public static vy a(String $$0) {
      return new vy($$0, Instant.now(), 0L, vm.b);
   }

   public void a(avb.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public vy.a a(vs $$0) {
      return new vy.a(this.b, this.c, this.d, this.e.a($$0));
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

   public vm d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, vm.a d) {
      public a(ui $$0) {
         this($$0.d(256), $$0.w(), $$0.readLong(), new vm.a($$0));
      }

      public void a(ui $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<vy> a(vs $$0) {
         return this.d.a($$0).map($$0x -> new vy(this.a, this.b, this.c, $$0x));
      }
   }
}
