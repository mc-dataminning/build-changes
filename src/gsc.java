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

public class gsc {
   private final grz a;
   final gsa b;
   private final gsb c;
   private final Runnable d;
   private gsc.c e;
   final List<gsc.e> f = new ArrayList<>();

   public gsc(grz $$0, gsa $$1, gsb $$2, Runnable $$3, gsc.c $$4) {
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
      for (gsc.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(gsc.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == gsc.c.c) {
         this.b.a($$0, gsa.a.a);
      } else {
         this.a($$0, new gsc.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == gsc.c.c) {
         this.b.a($$0, gsa.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         gsc.e $$5 = new gsc.e($$0, $$2, null);
         $$5.f = gsc.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, gsc.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == gsc.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(gsc.e $$0) {
      this.b.a($$0.a, gsa.b.a);
      $$0.h = true;
   }

   @Nullable
   private gsc.e c(UUID $$0) {
      for (gsc.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      gsc.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(gsc.d.e);
         this.f();
      }
   }

   public void a() {
      for (gsc.e $$0 : this.f) {
         $$0.a(gsc.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = gsc.c.b;

      for (gsc.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = gsc.c.c;

      for (gsc.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(gsc.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = gsc.c.a;
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
         if ($$0.g != gsc.a.a) {
            return false;
         } else if ($$0.e != null) {
            gsa.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<gsc.e> $$0, asb.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (gsc.e $$2 : this.f) {
            if ($$2.g != gsc.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(gsc.d.a);
               } else {
                  $$2.a(gsc.d.d);
               }
            }
         }
      }

      for (gsc.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = gsc.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, gsa.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<gsc.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (gsc.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != gsc.b.c) {
               $$1 = true;
            }

            if ($$2.f == gsc.b.a) {
               $$2.f = gsc.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, asb.c> $$3 = new HashMap<>();

         for (gsc.e $$4 : $$0) {
            $$3.put($$4.a, new asb.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<gsc.e> $$1 = new ArrayList<>();
      final List<gsc.e> $$2 = new ArrayList<>();

      for (gsc.e $$3 : this.f) {
         if ($$3.g == gsc.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == gsc.b.c && !$$3.a();
         if ($$4 && $$3.g == gsc.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == gsc.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (gsc.e $$5 : $$1) {
            if ($$5.g != gsc.a.c) {
               $$5.g = gsc.a.b;
            }
         }

         for (gsc.e $$6 : $$2) {
            $$6.g = gsc.a.b;
         }

         this.c.scheduleReload(new gsb.a() {
            @Override
            public void a() {
               for (gsc.e $$0 : $$1) {
                  $$0.g = gsc.a.c;
                  if ($$0.e == null) {
                     gsc.this.b.a($$0.a, gsa.a.b);
                  }
               }

               for (gsc.e $$1 : $$2) {
                  $$1.g = gsc.a.a;
               }

               gsc.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (gsc.e $$1 : gsc.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(gsc.d.d);
                           break;
                        case b:
                           $$1.g = gsc.a.a;
                           $$1.a(gsc.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  gsc.this.f();
               } else {
                  for (gsc.e $$2 : gsc.this.f) {
                     if ($$2.g == gsc.a.b) {
                        $$2.g = gsc.a.a;
                     }
                  }
               }
            }

            @Override
            public List<gsb.b> b() {
               return $$1.stream().map($$0 -> new gsb.b($$0.a, $$0.d)).toList();
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
      a(gsa.a.d),
      b(gsa.a.e),
      c(gsa.a.a),
      d(gsa.a.c),
      e(null),
      f(null);

      @Nullable
      final gsa.a g;

      private d(@Nullable final gsa.a $$0) {
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
      gsc.d e;
      gsc.b f = gsc.b.a;
      gsc.a g = gsc.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(gsc.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
