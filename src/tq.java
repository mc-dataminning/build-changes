import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record tq(int b, UUID c, UUID d) {
   public static final Codec<tq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aoi.i.fieldOf("index").forGetter(tq::b), hy.a.fieldOf("sender").forGetter(tq::c), hy.a.fieldOf("session_id").forGetter(tq::d))
            .apply($$0, tq::new)
   );

   public static tq a(UUID $$0) {
      return a($$0, ac.c);
   }

   public static tq a(UUID $$0, UUID $$1) {
      return new tq(0, $$0, $$1);
   }

   public void a(api.a $$0) throws SignatureException {
      $$0.update(hy.b(this.c));
      $$0.update(hy.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(tq $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public tq a() {
      return this.b == Integer.MAX_VALUE ? null : new tq(this.b + 1, this.c, this.d);
   }
}
