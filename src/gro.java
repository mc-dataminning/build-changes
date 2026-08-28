import com.google.common.hash.HashCode;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;

public class gro {
   private final grl a;
   final grm b;
   private final grn c;
   private final Runnable d;
   private gro.c e;
   final List<gro.e> f = new ArrayList<>();

   public gro(grl $$0, grm $$1, grn $$2, Runnable $$3, gro.c $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   void f() {
      this.d.run();
   }

   private void b(UUID $$0) {
      for (gro.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(gro.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == gro.c.c) {
         this.b.a($$0, grm.a.a);
      } else {
         this.a($$0, new gro.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == gro.c.c) {
         this.b.a($$0, grm.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         gro.e $$5 = new gro.e($$0, $$2, null);
         $$5.f = gro.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, gro.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == gro.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(gro.e $$0) {
      this.b.a($$0.a, grm.b.a);
      $$0.h = true;
   }

   @Nullable
   private gro.e c(UUID $$0) {
      for (gro.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      gro.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(gro.d.e);
         this.f();
      }
   }

   public void a() {
      for (gro.e $$0 : this.f) {
         $$0.a(gro.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = gro.c.b;

      for (gro.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = gro.c.c;

      for (gro.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(gro.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = gro.c.a;
   }

   public void e() {
      boolean $$0 = this.h();
      if (!$$0) {
         this.i();
      }

      this.g();
   }

   private void g() {
      this.f.removeIf($$0 -> {
         if ($$0.g != gro.a.a) {
            return false;
         } else if ($$0.e != null) {
            grm.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<gro.e> $$0, ass.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (gro.e $$2 : this.f) {
            if ($$2.g != gro.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(gro.d.a);
               } else {
                  $$2.a(gro.d.d);
               }
            }
         }
      }

      for (gro.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = gro.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, grm.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<gro.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (gro.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != gro.b.c) {
               $$1 = true;
            }

            if ($$2.f == gro.b.a) {
               $$2.f = gro.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, ass.c> $$3 = new HashMap<>();

         for (gro.e $$4 : $$0) {
            $$3.put($$4.a, new ass.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<gro.e> $$1 = new ArrayList<>();
      final List<gro.e> $$2 = new ArrayList<>();

      for (gro.e $$3 : this.f) {
         if ($$3.g == gro.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == gro.b.c && !$$3.a();
         if ($$4 && $$3.g == gro.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == gro.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (gro.e $$5 : $$1) {
            if ($$5.g != gro.a.c) {
               $$5.g = gro.a.b;
            }
         }

         for (gro.e $$6 : $$2) {
            $$6.g = gro.a.b;
         }

         this.c.scheduleReload(new grn.a() {
            @Override
            public void a() {
               for (gro.e $$0 : $$1) {
                  $$0.g = gro.a.c;
                  if ($$0.e == null) {
                     gro.this.b.a($$0.a, grm.a.b);
                  }
               }

               for (gro.e $$1 : $$2) {
                  $$1.g = gro.a.a;
               }

               gro.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (gro.e $$1 : gro.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(gro.d.d);
                           break;
                        case b:
                           $$1.g = gro.a.a;
                           $$1.a(gro.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  gro.this.f();
               } else {
                  for (gro.e $$2 : gro.this.f) {
                     if ($$2.g == gro.a.b) {
                        $$2.g = gro.a.a;
                     }
                  }
               }
            }

            @Override
            public List<grn.b> b() {
               return $$1.stream().map($$0 -> new grn.b($$0.a, $$0.d)).toList();
            }
         });
      }
   }

   static enum a {
      a,
      b,
      c;
   }

   static enum b {
      a,
      b,
      c;
   }

   public static enum c {
      a,
      b,
      c;
   }

   static enum d {
      a(grm.a.d),
      b(grm.a.e),
      c(grm.a.a),
      d(grm.a.c),
      e(null),
      f(null);

      @Nullable
      final grm.a g;

      private d(@Nullable final grm.a $$0) {
         this.g = $$0;
      }
   }

   static class e {
      final UUID a;
      final URL b;
      @Nullable
      final HashCode c;
      @Nullable
      Path d;
      @Nullable
      gro.d e;
      gro.b f = gro.b.a;
      gro.a g = gro.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(gro.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
