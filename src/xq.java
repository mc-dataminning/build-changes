import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class xq implements wj {
   public static final MapCodec<xq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(xq::b), Codec.STRING.fieldOf("objective").forGetter(xq::d)).apply($$0, xq::new)
   );
   public static final MapCodec<xq> b = a.fieldOf("score");
   public static final wj.a<xq> c = new wj.a<>(b, "score");
   private final String d;
   @Nullable
   private final gk e;
   private final String f;

   @Nullable
   private static gk a(String $$0) {
      try {
         return new gl(new StringReader($$0)).t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   public xq(String $$0, String $$1) {
      this.d = $$0;
      this.e = a($$0);
      this.f = $$1;
   }

   @Override
   public wj.a<?> a() {
      return c;
   }

   public String b() {
      return this.d;
   }

   @Nullable
   public gk c() {
      return this.e;
   }

   public String d() {
      return this.f;
   }

   private etm a(dv $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends bqa> $$1 = this.e.b($$0);
         if (!$$1.isEmpty()) {
            if ($$1.size() != 1) {
               throw ei.a.create();
            }

            return $$1.get(0);
         }
      }

      return etm.c(this.d);
   }

   private ww a(etm $$0, dv $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         etn $$3 = $$2.aK();
         etf $$4 = $$3.a(this.f);
         if ($$4 != null) {
            etj $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(yb.b));
            }
         }
      }

      return wi.i();
   }

   @Override
   public ww a(@Nullable dv $$0, @Nullable bqa $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return wi.i();
      } else {
         etm $$3 = this.a($$0);
         etm $$4 = (etm)($$1 != null && $$3.equals(etm.cy) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof xq $$1 && this.d.equals($$1.d) && this.f.equals($$1.f)) {
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
