import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class yw implements xp {
   public static final MapCodec<yw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(yw::b), Codec.STRING.fieldOf("objective").forGetter(yw::d)).apply($$0, yw::new)
   );
   public static final MapCodec<yw> b = a.fieldOf("score");
   public static final xp.a<yw> c = new xp.a<>(b, "score");
   private final String d;
   @Nullable
   private final he e;
   private final String f;

   @Nullable
   private static he a(String $$0) {
      try {
         return new hf(new StringReader($$0)).t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   public yw(String $$0, String $$1) {
      this.d = $$0;
      this.e = a($$0);
      this.f = $$1;
   }

   @Override
   public xp.a<?> a() {
      return c;
   }

   public String b() {
      return this.d;
   }

   @Nullable
   public he c() {
      return this.e;
   }

   public String d() {
      return this.f;
   }

   private ews a(ep $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends bss> $$1 = this.e.b($$0);
         if (!$$1.isEmpty()) {
            if ($$1.size() != 1) {
               throw fc.a.create();
            }

            return $$1.get(0);
         }
      }

      return ews.c(this.d);
   }

   private yc a(ews $$0, ep $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         ewt $$3 = $$2.aK();
         ewl $$4 = $$3.a(this.f);
         if ($$4 != null) {
            ewp $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(zh.b));
            }
         }
      }

      return xo.i();
   }

   @Override
   public yc a(@Nullable ep $$0, @Nullable bss $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xo.i();
      } else {
         ews $$3 = this.a($$0);
         ews $$4 = (ews)($$1 != null && $$3.equals(ews.cy) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof yw $$1 && this.d.equals($$1.d) && this.f.equals($$1.f)) {
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
