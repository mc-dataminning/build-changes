import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class yg implements wz {
   public static final MapCodec<yg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(yg::b), Codec.STRING.fieldOf("objective").forGetter(yg::d)).apply($$0, yg::new)
   );
   public static final MapCodec<yg> b = a.fieldOf("score");
   public static final wz.a<yg> c = new wz.a<>(b, "score");
   private final String d;
   @Nullable
   private final hi e;
   private final String f;

   @Nullable
   private static hi a(String $$0) {
      try {
         return new hj(new StringReader($$0)).t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   public yg(String $$0, String $$1) {
      this.d = $$0;
      this.e = a($$0);
      this.f = $$1;
   }

   @Override
   public wz.a<?> a() {
      return c;
   }

   public String b() {
      return this.d;
   }

   @Nullable
   public hi c() {
      return this.e;
   }

   public String d() {
      return this.f;
   }

   private exz a(et $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends bsq> $$1 = this.e.b($$0);
         if (!$$1.isEmpty()) {
            if ($$1.size() != 1) {
               throw fg.a.create();
            }

            return $$1.get(0);
         }
      }

      return exz.c(this.d);
   }

   private xm a(exz $$0, et $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         eya $$3 = $$2.aK();
         exs $$4 = $$3.a(this.f);
         if ($$4 != null) {
            exw $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(yr.b));
            }
         }
      }

      return wy.i();
   }

   @Override
   public xm a(@Nullable et $$0, @Nullable bsq $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return wy.i();
      } else {
         exz $$3 = this.a($$0);
         exz $$4 = (exz)($$1 != null && $$3.equals(exz.cA) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof yg $$1 && this.d.equals($$1.d) && this.f.equals($$1.f)) {
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
