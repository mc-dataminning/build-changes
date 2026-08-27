import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record vu(String b, Instant c, long d, vi e) {
   public static final MapCodec<vu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(vu::a),
               atg.m.fieldOf("time_stamp").forGetter(vu::b),
               Codec.LONG.fieldOf("salt").forGetter(vu::c),
               vi.a.optionalFieldOf("last_seen", vi.b).forGetter(vu::d)
            )
            .apply($$0, vu::new)
   );

   public static vu a(String $$0) {
      return new vu($$0, Instant.now(), 0L, vi.b);
   }

   public void a(auk.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public vu.a a(vo $$0) {
      return new vu.a(this.b, this.c, this.d, this.e.a($$0));
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

   public vi d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, vi.a d) {
      public a(ue $$0) {
         this($$0.d(256), $$0.w(), $$0.readLong(), new vi.a($$0));
      }

      public void a(ue $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<vu> a(vo $$0) {
         return this.d.a($$0).map($$0x -> new vu(this.a, this.b, this.c, $$0x));
      }
   }
}
