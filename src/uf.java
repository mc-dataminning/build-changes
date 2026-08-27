import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record uf(String b, Instant c, long d, tt e) {
   public static final MapCodec<uf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(uf::a),
               arh.m.fieldOf("time_stamp").forGetter(uf::b),
               Codec.LONG.fieldOf("salt").forGetter(uf::c),
               tt.a.optionalFieldOf("last_seen", tt.b).forGetter(uf::d)
            )
            .apply($$0, uf::new)
   );

   public static uf a(String $$0) {
      return new uf($$0, Instant.now(), 0L, tt.b);
   }

   public void a(asi.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public uf.a a(tz $$0) {
      return new uf.a(this.b, this.c, this.d, this.e.a($$0));
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

   public tt d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, tt.a d) {
      public a(sq $$0) {
         this($$0.d(256), $$0.v(), $$0.readLong(), new tt.a($$0));
      }

      public void a(sq $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<uf> a(tz $$0) {
         return this.d.a($$0).map($$0x -> new uf(this.a, this.b, this.c, $$0x));
      }
   }
}
