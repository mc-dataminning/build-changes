import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class wk implements vc {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<wk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("selector").forGetter(wk::b), atg.a(vd.a, "separator").forGetter(wk::d)).apply($$0, wk::new)
   );
   public static final vc.a<wk> b = new vc.a<>(a, "selector");
   private final String e;
   @Nullable
   private final gc f;
   protected final Optional<vb> c;

   public wk(String $$0, Optional<vb> $$1) {
      this.e = $$0;
      this.c = $$1;
      this.f = a($$0);
   }

   @Nullable
   private static gc a(String $$0) {
      gc $$1 = null;

      try {
         gd $$2 = new gd(new StringReader($$0));
         $$1 = $$2.t();
      } catch (CommandSyntaxException var3) {
         d.warn("Invalid selector component: {}: {}", $$0, var3.getMessage());
      }

      return $$1;
   }

   @Override
   public vc.a<?> a() {
      return b;
   }

   public String b() {
      return this.e;
   }

   @Nullable
   public gc c() {
      return this.f;
   }

   public Optional<vb> d() {
      return this.c;
   }

   @Override
   public vp a(@Nullable ds $$0, @Nullable blf $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.f != null) {
         Optional<? extends vb> $$3 = ve.a($$0, this.c, $$1, $$2);
         return ve.a(this.f.b($$0), $$3, blf::Q_);
      } else {
         return vb.i();
      }
   }

   @Override
   public <T> Optional<T> a(vg.b<T> $$0, vy $$1) {
      return $$0.accept($$1, this.e);
   }

   @Override
   public <T> Optional<T> a(vg.a<T> $$0) {
      return $$0.accept(this.e);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof wk $$1 && this.e.equals($$1.e) && this.c.equals($$1.c)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.e.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }

   @Override
   public String toString() {
      return "pattern{" + this.e + "}";
   }
}
