import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class glm implements glc {
   protected final List<fyp> a;
   protected final Map<ih, List<fyp>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final gjc f;
   protected final fzb g;
   protected final fyz h;

   public glm(List<fyp> $$0, Map<ih, List<fyp>> $$1, boolean $$2, boolean $$3, boolean $$4, gjc $$5, fzb $$6, fyz $$7) {
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
   public List<fyp> a(@Nullable dnb $$0, @Nullable ih $$1, axd $$2) {
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
   public gjc e() {
      return this.f;
   }

   @Override
   public fzb f() {
      return this.g;
   }

   @Override
   public fyz g() {
      return this.h;
   }

   public static class a {
      private final List<fyp> a = Lists.newArrayList();
      private final Map<ih, List<fyp>> b = Maps.newEnumMap(ih.class);
      private final fyz c;
      private final boolean d;
      private gjc e;
      private final boolean f;
      private final boolean g;
      private final fzb h;

      public a(fyu $$0, fyz $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, fzb $$3, fyz $$4) {
         for (ih $$5 : ih.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public glm.a a(ih $$0, fyp $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public glm.a a(fyp $$0) {
         this.a.add($$0);
         return this;
      }

      public glm.a a(gjc $$0) {
         this.e = $$0;
         return this;
      }

      public glm.a a() {
         return this;
      }

      public glc b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new glm(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
