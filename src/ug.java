import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record ug(int b, UUID c, UUID d) {
   public static final Codec<ug> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arj.i.fieldOf("index").forGetter(ug::b), hx.a.fieldOf("sender").forGetter(ug::c), hx.a.fieldOf("session_id").forGetter(ug::d))
            .apply($$0, ug::new)
   );

   public static ug a(UUID $$0) {
      return a($$0, ac.d);
   }

   public static ug a(UUID $$0, UUID $$1) {
      return new ug(0, $$0, $$1);
   }

   public void a(asl.a $$0) throws SignatureException {
      $$0.update(hx.b(this.c));
      $$0.update(hx.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(ug $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public ug a() {
      return this.b == Integer.MAX_VALUE ? null : new ug(this.b + 1, this.c, this.d);
   }
}
