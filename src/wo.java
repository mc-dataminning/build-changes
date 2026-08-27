import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class wo implements vg {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<wo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("selector").forGetter(wo::b), atw.a(vh.a, "separator").forGetter(wo::d)).apply($$0, wo::new)
   );
   public static final vg.a<wo> b = new vg.a<>(a, "selector");
   private final String e;
   @Nullable
   private final ge f;
   protected final Optional<vf> c;

   public wo(String $$0, Optional<vf> $$1) {
      this.e = $$0;
      this.c = $$1;
      this.f = a($$0);
   }

   @Nullable
   private static ge a(String $$0) {
      ge $$1 = null;

      try {
         gf $$2 = new gf(new StringReader($$0));
         $$1 = $$2.t();
      } catch (CommandSyntaxException var3) {
         d.warn("Invalid selector component: {}: {}", $$0, var3.getMessage());
      }

      return $$1;
   }

   @Override
   public vg.a<?> a() {
      return b;
   }

   public String b() {
      return this.e;
   }

   @Nullable
   public ge c() {
      return this.f;
   }

   public Optional<vf> d() {
      return this.c;
   }

   @Override
   public vt a(@Nullable ds $$0, @Nullable blv $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.f != null) {
         Optional<? extends vf> $$3 = vi.a($$0, this.c, $$1, $$2);
         return vi.a(this.f.b($$0), $$3, blv::Q_);
      } else {
         return vf.i();
      }
   }

   @Override
   public <T> Optional<T> a(vk.b<T> $$0, wc $$1) {
      return $$0.accept($$1, this.e);
   }

   @Override
   public <T> Optional<T> a(vk.a<T> $$0) {
      return $$0.accept(this.e);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof wo $$1 && this.e.equals($$1.e) && this.c.equals($$1.c)) {
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
