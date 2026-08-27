import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class xd implements vv {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<xd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("selector").forGetter(xd::b), awe.a(vw.a, "separator").forGetter(xd::d)).apply($$0, xd::new)
   );
   public static final vv.a<xd> b = new vv.a<>(a, "selector");
   private final String e;
   @Nullable
   private final gi f;
   protected final Optional<vu> c;

   public xd(String $$0, Optional<vu> $$1) {
      this.e = $$0;
      this.c = $$1;
      this.f = a($$0);
   }

   @Nullable
   private static gi a(String $$0) {
      gi $$1 = null;

      try {
         gj $$2 = new gj(new StringReader($$0));
         $$1 = $$2.t();
      } catch (CommandSyntaxException var3) {
         d.warn("Invalid selector component: {}: {}", $$0, var3.getMessage());
      }

      return $$1;
   }

   @Override
   public vv.a<?> a() {
      return b;
   }

   public String b() {
      return this.e;
   }

   @Nullable
   public gi c() {
      return this.f;
   }

   public Optional<vu> d() {
      return this.c;
   }

   @Override
   public wi a(@Nullable du $$0, @Nullable box $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.f != null) {
         Optional<? extends vu> $$3 = vx.a($$0, this.c, $$1, $$2);
         return vx.a(this.f.b($$0), $$3, box::O_);
      } else {
         return vu.i();
      }
   }

   @Override
   public <T> Optional<T> a(vz.b<T> $$0, wr $$1) {
      return $$0.accept($$1, this.e);
   }

   @Override
   public <T> Optional<T> a(vz.a<T> $$0) {
      return $$0.accept(this.e);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof xd $$1 && this.e.equals($$1.e) && this.c.equals($$1.c)) {
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
