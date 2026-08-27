import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gaw implements gam {
   protected final List<foh> a;
   protected final Map<ha, List<foh>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final fyl f;
   protected final fou g;
   protected final fos h;

   public gaw(List<foh> $$0, Map<ha, List<foh>> $$1, boolean $$2, boolean $$3, boolean $$4, fyl $$5, fou $$6, fos $$7) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$4;
      this.e = $$3;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
   }

   @Override
   public List<foh> a(@Nullable dfa $$0, @Nullable ha $$1, aru $$2) {
      return $$1 == null ? this.a : this.b.get($$1);
   }

   @Override
   public boolean a() {
      return this.c;
   }

   @Override
   public boolean b() {
      return this.d;
   }

   @Override
   public boolean c() {
      return this.e;
   }

   @Override
   public boolean d() {
      return false;
   }

   @Override
   public fyl e() {
      return this.f;
   }

   @Override
   public fou f() {
      return this.g;
   }

   @Override
   public fos g() {
      return this.h;
   }

   public static class a {
      private final List<foh> a = Lists.newArrayList();
      private final Map<ha, List<foh>> b = Maps.newEnumMap(ha.class);
      private final fos c;
      private final boolean d;
      private fyl e;
      private final boolean f;
      private final boolean g;
      private final fou h;

      public a(fom $$0, fos $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, fou $$3, fos $$4) {
         for (ha $$5 : ha.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public gaw.a a(ha $$0, foh $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gaw.a a(foh $$0) {
         this.a.add($$0);
         return this;
      }

      public gaw.a a(fyl $$0) {
         this.e = $$0;
         return this;
      }

      public gaw.a a() {
         return this;
      }

      public gam b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new gaw(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
