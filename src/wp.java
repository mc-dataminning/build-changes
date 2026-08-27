import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record wp(int b, UUID c, UUID d) {
   public static final Codec<wp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awe.j.fieldOf("index").forGetter(wp::b), jf.a.fieldOf("sender").forGetter(wp::c), jf.a.fieldOf("session_id").forGetter(wp::d))
            .apply($$0, wp::new)
   );

   public static wp a(UUID $$0) {
      return a($$0, ac.d);
   }

   public static wp a(UUID $$0, UUID $$1) {
      return new wp(0, $$0, $$1);
   }

   public void a(axh.a $$0) throws SignatureException {
      $$0.update(jf.b(this.c));
      $$0.update(jf.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(wp $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public wp a() {
      return this.b == Integer.MAX_VALUE ? null : new wp(this.b + 1, this.c, this.d);
   }
}
