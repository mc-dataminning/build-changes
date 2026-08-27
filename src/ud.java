import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public record ud(String b, Instant c, long d, tr e) {
   public static final MapCodec<ud> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("content").forGetter(ud::a),
               arf.m.fieldOf("time_stamp").forGetter(ud::b),
               Codec.LONG.fieldOf("salt").forGetter(ud::c),
               tr.a.optionalFieldOf("last_seen", tr.b).forGetter(ud::d)
            )
            .apply($$0, ud::new)
   );

   public static ud a(String $$0) {
      return new ud($$0, Instant.now(), 0L, tr.b);
   }

   public void a(asg.a $$0) throws SignatureException {
      $$0.update(Longs.toByteArray(this.d));
      $$0.update(Longs.toByteArray(this.c.getEpochSecond()));
      byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
      $$0.update(Ints.toByteArray($$1.length));
      $$0.update($$1);
      this.e.a($$0);
   }

   public ud.a a(tx $$0) {
      return new ud.a(this.b, this.c, this.d, this.e.a($$0));
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

   public tr d() {
      return this.e;
   }

   public static record a(String a, Instant b, long c, tr.a d) {
      public a(so $$0) {
         this($$0.d(256), $$0.v(), $$0.readLong(), new tr.a($$0));
      }

      public void a(so $$0) {
         $$0.a(this.a, 256);
         $$0.a(this.b);
         $$0.b(this.c);
         this.d.a($$0);
      }

      public Optional<ud> a(tx $$0) {
         return this.d.a($$0).map($$0x -> new ud(this.a, this.b, this.c, $$0x));
      }
   }
}
