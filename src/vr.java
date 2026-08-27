import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class vr implements uj {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<vr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("selector").forGetter(vr::b), asg.a(uk.a, "separator").forGetter(vr::d)).apply($$0, vr::new)
   );
   public static final uj.a<vr> b = new uj.a<>(a, "selector");
   private final String e;
   @Nullable
   private final ge f;
   protected final Optional<ui> c;

   public vr(String $$0, Optional<ui> $$1) {
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
   public uj.a<?> a() {
      return b;
   }

   public String b() {
      return this.e;
   }

   @Nullable
   public ge c() {
      return this.f;
   }

   public Optional<ui> d() {
      return this.c;
   }

   @Override
   public uw a(@Nullable du $$0, @Nullable bjt $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.f != null) {
         Optional<? extends ui> $$3 = ul.a($$0, this.c, $$1, $$2);
         return ul.a(this.f.b($$0), $$3, bjt::O_);
      } else {
         return ui.i();
      }
   }

   @Override
   public <T> Optional<T> a(un.b<T> $$0, vf $$1) {
      return $$0.accept($$1, this.e);
   }

   @Override
   public <T> Optional<T> a(un.a<T> $$0) {
      return $$0.accept(this.e);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof vr $$1 && this.e.equals($$1.e) && this.c.equals($$1.c)) {
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
