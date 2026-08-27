import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record vw(int b, UUID c, UUID d) {
   public static final Codec<vw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atg.i.fieldOf("index").forGetter(vw::b), iy.a.fieldOf("sender").forGetter(vw::c), iy.a.fieldOf("session_id").forGetter(vw::d))
            .apply($$0, vw::new)
   );

   public static vw a(UUID $$0) {
      return a($$0, ac.d);
   }

   public static vw a(UUID $$0, UUID $$1) {
      return new vw(0, $$0, $$1);
   }

   public void a(auk.a $$0) throws SignatureException {
      $$0.update(iy.b(this.c));
      $$0.update(iy.b(this.d));
      $$0.update(Ints.toByteArray(this.b));
   }

   public boolean a(vw $$0) {
      return this.b > $$0.b() && this.c.equals($$0.c()) && this.d.equals($$0.d());
   }

   @Nullable
   public vw a() {
      return this.b == Integer.MAX_VALUE ? null : new vw(this.b + 1, this.c, this.d);
   }
}
