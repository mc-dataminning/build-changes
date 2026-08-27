import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class xc implements vv {
   public static final MapCodec<xc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(xc::b), Codec.STRING.fieldOf("objective").forGetter(xc::d)).apply($$0, xc::new)
   );
   public static final MapCodec<xc> b = a.fieldOf("score");
   public static final vv.a<xc> c = new vv.a<>(b, "score");
   private final String d;
   @Nullable
   private final gi e;
   private final String f;

   @Nullable
   private static gi a(String $$0) {
      try {
         return new gj(new StringReader($$0)).t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   public xc(String $$0, String $$1) {
      this.d = $$0;
      this.e = a($$0);
      this.f = $$1;
   }

   @Override
   public vv.a<?> a() {
      return c;
   }

   public String b() {
      return this.d;
   }

   @Nullable
   public gi c() {
      return this.e;
   }

   public String d() {
      return this.f;
   }

   private equ a(du $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends bow> $$1 = this.e.b($$0);
         if (!$$1.isEmpty()) {
            if ($$1.size() != 1) {
               throw eh.a.create();
            }

            return $$1.get(0);
         }
      }

      return equ.d(this.d);
   }

   private wi a(equ $$0, du $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         eqv $$3 = $$2.aK();
         eqn $$4 = $$3.a(this.f);
         if ($$4 != null) {
            eqr $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(xn.b));
            }
         }
      }

      return vu.i();
   }

   @Override
   public wi a(@Nullable du $$0, @Nullable bow $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return vu.i();
      } else {
         equ $$3 = this.a($$0);
         equ $$4 = (equ)($$1 != null && $$3.equals(equ.cy) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof xc $$1 && this.d.equals($$1.d) && this.f.equals($$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.d.hashCode();
      return 31 * $$0 + this.f.hashCode();
   }

   @Override
   public String toString() {
      return "score{name='" + this.d + "', objective='" + this.f + "'}";
   }
}
