import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class yh implements xa {
   public static final MapCodec<yh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(yh::b), Codec.STRING.fieldOf("objective").forGetter(yh::d)).apply($$0, yh::new)
   );
   public static final MapCodec<yh> b = a.fieldOf("score");
   public static final xa.a<yh> c = new xa.a<>(b, "score");
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

   public yh(String $$0, String $$1) {
      this.d = $$0;
      this.e = a($$0);
      this.f = $$1;
   }

   @Override
   public xa.a<?> a() {
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

   private eyd a(et $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends bsr> $$1 = this.e.b($$0);
         if (!$$1.isEmpty()) {
            if ($$1.size() != 1) {
               throw fg.a.create();
            }

            return $$1.get(0);
         }
      }

      return eyd.c(this.d);
   }

   private xn a(eyd $$0, et $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         eye $$3 = $$2.aK();
         exw $$4 = $$3.a(this.f);
         if ($$4 != null) {
            eya $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(ys.b));
            }
         }
      }

      return wz.i();
   }

   @Override
   public xn a(@Nullable et $$0, @Nullable bsr $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return wz.i();
      } else {
         eyd $$3 = this.a($$0);
         eyd $$4 = (eyd)($$1 != null && $$3.equals(eyd.cA) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof yh $$1 && this.d.equals($$1.d) && this.f.equals($$1.f)) {
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
