import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record uh(int b, UUID c, UUID d) {
   public static final Codec<uh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arh.i.fieldOf("index").forGetter(uh::b), ia.a.fieldOf("sender").forGetter(uh::c), ia.a.fieldOf("session_id").forGetter(uh::d))
            .apply($$0, uh::new)
   );

   public static uh a(UUID $$0) {
      return a($$0, ac.d);
   }

   public static uh a(UUID $$0, UUID $$1) {
      return new uh(0, $$0, $$1);
   }

   public void a(asi.a $$0) throws SignatureException {
      $$0.update(ia.b(this.c));
      $$0.update(ia.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(uh $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public uh a() {
      return this.b == Integer.MAX_VALUE ? null : new uh(this.b + 1, this.c, this.d);
   }
}
