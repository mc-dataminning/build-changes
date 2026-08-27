import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gbl implements gbb {
   protected final List<fox> a;
   protected final Map<ha, List<fox>> b;
   protected final boolean c;
   protected final boolean d;
   protected final boolean e;
   protected final fza f;
   protected final fpj g;
   protected final fph h;

   public gbl(List<fox> $$0, Map<ha, List<fox>> $$1, boolean $$2, boolean $$3, boolean $$4, fza $$5, fpj $$6, fph $$7) {
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
   public List<fox> a(@Nullable dfd $$0, @Nullable ha $$1, ash $$2) {
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
   public fza e() {
      return this.f;
   }

   @Override
   public fpj f() {
      return this.g;
   }

   @Override
   public fph g() {
      return this.h;
   }

   public static class a {
      private final List<fox> a = Lists.newArrayList();
      private final Map<ha, List<fox>> b = Maps.newEnumMap(ha.class);
      private final fph c;
      private final boolean d;
      private fza e;
      private final boolean f;
      private final boolean g;
      private final fpj h;

      public a(fpc $$0, fph $$1, boolean $$2) {
         this($$0.b(), $$0.c().a(), $$2, $$0.h(), $$1);
      }

      private a(boolean $$0, boolean $$1, boolean $$2, fpj $$3, fph $$4) {
         for (ha $$5 : ha.values()) {
            this.b.put($$5, Lists.newArrayList());
         }

         this.c = $$4;
         this.d = $$0;
         this.f = $$1;
         this.g = $$2;
         this.h = $$3;
      }

      public gbl.a a(ha $$0, fox $$1) {
         this.b.get($$0).add($$1);
         return this;
      }

      public gbl.a a(fox $$0) {
         this.a.add($$0);
         return this;
      }

      public gbl.a a(fza $$0) {
         this.e = $$0;
         return this;
      }

      public gbl.a a() {
         return this;
      }

      public gbb b() {
         if (this.e == null) {
            throw new RuntimeException("Missing particle!");
         } else {
            return new gbl(this.a, this.b, this.d, this.f, this.g, this.e, this.h, this.c);
         }
      }
   }
}
