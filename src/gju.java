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

public class gju {
   private final gjr a;
   final gjs b;
   private final gjt c;
   private final Runnable d;
   private gju.c e;
   final List<gju.e> f = new ArrayList<>();

   public gju(gjr $$0, gjs $$1, gjt $$2, Runnable $$3, gju.c $$4) {
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
      for (gju.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(gju.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == gju.c.c) {
         this.b.a($$0, gjs.a.a);
      } else {
         this.a($$0, new gju.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == gju.c.c) {
         this.b.a($$0, gjs.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         gju.e $$5 = new gju.e($$0, $$2, null);
         $$5.f = gju.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, gju.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == gju.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(gju.e $$0) {
      this.b.a($$0.a, gjs.b.a);
      $$0.h = true;
   }

   @Nullable
   private gju.e c(UUID $$0) {
      for (gju.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      gju.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(gju.d.e);
         this.f();
      }
   }

   public void a() {
      for (gju.e $$0 : this.f) {
         $$0.a(gju.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = gju.c.b;

      for (gju.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = gju.c.c;

      for (gju.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(gju.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = gju.c.a;
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
         if ($$0.g != gju.a.a) {
            return false;
         } else if ($$0.e != null) {
            gjs.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<gju.e> $$0, aql.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (gju.e $$2 : this.f) {
            if ($$2.g != gju.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(gju.d.a);
               } else {
                  $$2.a(gju.d.d);
               }
            }
         }
      }

      for (gju.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = gju.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, gjs.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<gju.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (gju.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != gju.b.c) {
               $$1 = true;
            }

            if ($$2.f == gju.b.a) {
               $$2.f = gju.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, aql.c> $$3 = new HashMap<>();

         for (gju.e $$4 : $$0) {
            $$3.put($$4.a, new aql.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<gju.e> $$1 = new ArrayList<>();
      final List<gju.e> $$2 = new ArrayList<>();

      for (gju.e $$3 : this.f) {
         if ($$3.g == gju.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == gju.b.c && !$$3.a();
         if ($$4 && $$3.g == gju.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == gju.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (gju.e $$5 : $$1) {
            if ($$5.g != gju.a.c) {
               $$5.g = gju.a.b;
            }
         }

         for (gju.e $$6 : $$2) {
            $$6.g = gju.a.b;
         }

         this.c.scheduleReload(new gjt.a() {
            @Override
            public void a() {
               for (gju.e $$0 : $$1) {
                  $$0.g = gju.a.c;
                  if ($$0.e == null) {
                     gju.this.b.a($$0.a, gjs.a.b);
                  }
               }

               for (gju.e $$1 : $$2) {
                  $$1.g = gju.a.a;
               }

               gju.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (gju.e $$1 : gju.this.f) {
                     switch ($$1.g) {
                        case c:
                           $$1.add($$1);
                           break;
                        case b:
                           $$1.g = gju.a.a;
                           $$1.a(gju.d.b);
                           break;
                        case a:
                           $$1.a(gju.d.d);
                     }
                  }

                  gju.this.f();
               } else {
                  for (gju.e $$2 : gju.this.f) {
                     if ($$2.g == gju.a.b) {
                        $$2.g = gju.a.a;
                     }
                  }
               }
            }

            @Override
            public List<gjt.b> b() {
               return $$1.stream().map($$0 -> new gjt.b($$0.a, $$0.d)).toList();
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
      a(gjs.a.d),
      b(gjs.a.e),
      c(gjs.a.a),
      d(gjs.a.c),
      e(null),
      f(null);

      @Nullable
      final gjs.a g;

      private d(@Nullable gjs.a $$0) {
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
      gju.d e;
      gju.b f = gju.b.a;
      gju.a g = gju.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(gju.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
