import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record ue(String b, Instant c, long d, ts e) {
   public static final MapCodec<ue> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(ue::a),
               arj.m.fieldOf("time_stamp").forGetter(ue::b),
               Codec.LONG.fieldOf("salt").forGetter(ue::c),
               ts.a.optionalFieldOf("last_seen", ts.b).forGetter(ue::d)
            )
            .apply($$0, ue::new)
   );

   public static ue a(String $$0) {
      return new ue($$0, Instant.now(), 0L, ts.b);
   }

   public void a(asl.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public ue.a a(ty $$0) {
      return new ue.a(this.b, this.c, this.d, this.e.a($$0));
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

   public ts d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, ts.a d) {
      public a(so $$0) {
         this($$0.d(256), $$0.w(), $$0.readLong(), new ts.a($$0));
      }

      public void a(so $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<ue> a(ty $$0) {
         return this.d.a($$0).map($$0x -> new ue(this.a, this.b, this.c, $$0x));
      }
   }
}
