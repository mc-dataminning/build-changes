import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class yg implements wy {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<yg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("selector").forGetter(yg::b), wz.a.optionalFieldOf("separator").forGetter(yg::d)).apply($$0, yg::new)
   );
   public static final wy.a<yg> b = new wy.a<>(a, "selector");
   private final String e;
   @Nullable
   private final gt f;
   protected final Optional<wx> c;

   public yg(String $$0, Optional<wx> $$1) {
      this.e = $$0;
      this.c = $$1;
      this.f = a($$0);
   }

   @Nullable
   private static gt a(String $$0) {
      gt $$1 = null;

      try {
         gu $$2 = new gu(new StringReader($$0));
         $$1 = $$2.t();
      } catch (CommandSyntaxException var3) {
         d.warn("Invalid selector component: {}: {}", $$0, var3.getMessage());
      }

      return $$1;
   }

   @Override
   public wy.a<?> a() {
      return b;
   }

   public String b() {
      return this.e;
   }

   @Nullable
   public gt c() {
      return this.f;
   }

   public Optional<wx> d() {
      return this.c;
   }

   @Override
   public xl a(@Nullable ee $$0, @Nullable bru $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.f != null) {
         Optional<? extends wx> $$3 = xa.a($$0, this.c, $$1, $$2);
         return xa.a(this.f.b($$0), $$3, bru::O_);
      } else {
         return wx.i();
      }
   }

   @Override
   public <T> Optional<T> a(xc.b<T> $$0, xu $$1) {
      return $$0.accept($$1, this.e);
   }

   @Override
   public <T> Optional<T> a(xc.a<T> $$0) {
      return $$0.accept(this.e);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof yg $$1 && this.e.equals($$1.e) && this.c.equals($$1.c)) {
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
