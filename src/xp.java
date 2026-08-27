import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class xp implements wh {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<xp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("selector").forGetter(xp::b), aws.a(wi.a, "separator").forGetter(xp::d)).apply($$0, xp::new)
   );
   public static final wh.a<xp> b = new wh.a<>(a, "selector");
   private final String e;
   @Nullable
   private final gi f;
   protected final Optional<wg> c;

   public xp(String $$0, Optional<wg> $$1) {
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
   public wh.a<?> a() {
      return b;
   }

   public String b() {
      return this.e;
   }

   @Nullable
   public gi c() {
      return this.f;
   }

   public Optional<wg> d() {
      return this.c;
   }

   @Override
   public wu a(@Nullable du $$0, @Nullable bpv $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.f != null) {
         Optional<? extends wg> $$3 = wj.a($$0, this.c, $$1, $$2);
         return wj.a(this.f.b($$0), $$3, bpv::O_);
      } else {
         return wg.i();
      }
   }

   @Override
   public <T> Optional<T> a(wl.b<T> $$0, xd $$1) {
      return $$0.accept($$1, this.e);
   }

   @Override
   public <T> Optional<T> a(wl.a<T> $$0) {
      return $$0.accept(this.e);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof xp $$1 && this.e.equals($$1.e) && this.c.equals($$1.c)) {
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
