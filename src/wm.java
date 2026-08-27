import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class wm implements ve {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<wm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("selector").forGetter(wm::b), atq.a(vf.a, "separator").forGetter(wm::d)).apply($$0, wm::new)
   );
   public static final ve.a<wm> b = new ve.a<>(a, "selector");
   private final String e;
   @Nullable
   private final ge f;
   protected final Optional<vd> c;

   public wm(String $$0, Optional<vd> $$1) {
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
   public ve.a<?> a() {
      return b;
   }

   public String b() {
      return this.e;
   }

   @Nullable
   public ge c() {
      return this.f;
   }

   public Optional<vd> d() {
      return this.c;
   }

   @Override
   public vr a(@Nullable ds $$0, @Nullable blp $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.f != null) {
         Optional<? extends vd> $$3 = vg.a($$0, this.c, $$1, $$2);
         return vg.a(this.f.b($$0), $$3, blp::Q_);
      } else {
         return vd.i();
      }
   }

   @Override
   public <T> Optional<T> a(vi.b<T> $$0, wa $$1) {
      return $$0.accept($$1, this.e);
   }

   @Override
   public <T> Optional<T> a(vi.a<T> $$0) {
      return $$0.accept(this.e);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof wm $$1 && this.e.equals($$1.e) && this.c.equals($$1.c)) {
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
