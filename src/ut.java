import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ut implements tm {
   private static final String d = "*";
   public static final MapCodec<ut> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ut::b), Codec.STRING.fieldOf("objective").forGetter(ut::d)).apply($$0, ut::new)
   );
   public static final MapCodec<ut> b = a.fieldOf("score");
   public static final tm.a<ut> c = new tm.a<>(b, "score");
   private final String e;
   @Nullable
   private final gc f;
   private final String g;

   @Nullable
   private static gc a(String $$0) {
      try {
         return new gd(new StringReader($$0)).t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   public ut(String $$0, String $$1) {
      this.e = $$0;
      this.f = a($$0);
      this.g = $$1;
   }

   @Override
   public tm.a<?> a() {
      return c;
   }

   public String b() {
      return this.e;
   }

   @Nullable
   public gc c() {
      return this.f;
   }

   public String d() {
      return this.g;
   }

   private String a(dt $$0) throws CommandSyntaxException {
      if (this.f != null) {
         List<? extends biw> $$1 = this.f.b($$0);
         if (!$$1.isEmpty()) {
            if ($$1.size() != 1) {
               throw ee.a.create();
            }

            return $$1.get(0).cx();
         }
      }

      return this.e;
   }

   private String a(String $$0, dt $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         eig $$3 = $$2.aF();
         eid $$4 = $$3.b(this.g);
         if ($$4 != null && $$3.b($$0, $$4)) {
            eif $$5 = $$3.c($$0, $$4);
            return Integer.toString($$5.b());
         }
      }

      return "";
   }

   @Override
   public tz a(@Nullable dt $$0, @Nullable biw $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return tl.i();
      } else {
         String $$3 = this.a($$0);
         String $$4 = $$1 != null && $$3.equals("*") ? $$1.cx() : $$3;
         return tl.b(this.a($$4, $$0));
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof ut $$1 && this.e.equals($$1.e) && this.g.equals($$1.g)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.e.hashCode();
      return 31 * $$0 + this.g.hashCode();
   }

   @Override
   public String toString() {
      return "score{name='" + this.e + "', objective='" + this.g + "'}";
   }
}
