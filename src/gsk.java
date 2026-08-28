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

public class gsk {
   private final gsh a;
   final gsi b;
   private final gsj c;
   private final Runnable d;
   private gsk.c e;
   final List<gsk.e> f = new ArrayList<>();

   public gsk(gsh $$0, gsi $$1, gsj $$2, Runnable $$3, gsk.c $$4) {
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
      for (gsk.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(gsk.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == gsk.c.c) {
         this.b.a($$0, gsi.a.a);
      } else {
         this.a($$0, new gsk.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == gsk.c.c) {
         this.b.a($$0, gsi.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         gsk.e $$5 = new gsk.e($$0, $$2, null);
         $$5.f = gsk.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, gsk.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == gsk.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(gsk.e $$0) {
      this.b.a($$0.a, gsi.b.a);
      $$0.h = true;
   }

   @Nullable
   private gsk.e c(UUID $$0) {
      for (gsk.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      gsk.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(gsk.d.e);
         this.f();
      }
   }

   public void a() {
      for (gsk.e $$0 : this.f) {
         $$0.a(gsk.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = gsk.c.b;

      for (gsk.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = gsk.c.c;

      for (gsk.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(gsk.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = gsk.c.a;
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
         if ($$0.g != gsk.a.a) {
            return false;
         } else if ($$0.e != null) {
            gsi.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<gsk.e> $$0, asd.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (gsk.e $$2 : this.f) {
            if ($$2.g != gsk.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(gsk.d.a);
               } else {
                  $$2.a(gsk.d.d);
               }
            }
         }
      }

      for (gsk.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = gsk.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, gsi.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<gsk.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (gsk.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != gsk.b.c) {
               $$1 = true;
            }

            if ($$2.f == gsk.b.a) {
               $$2.f = gsk.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, asd.c> $$3 = new HashMap<>();

         for (gsk.e $$4 : $$0) {
            $$3.put($$4.a, new asd.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<gsk.e> $$1 = new ArrayList<>();
      final List<gsk.e> $$2 = new ArrayList<>();

      for (gsk.e $$3 : this.f) {
         if ($$3.g == gsk.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == gsk.b.c && !$$3.a();
         if ($$4 && $$3.g == gsk.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == gsk.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (gsk.e $$5 : $$1) {
            if ($$5.g != gsk.a.c) {
               $$5.g = gsk.a.b;
            }
         }

         for (gsk.e $$6 : $$2) {
            $$6.g = gsk.a.b;
         }

         this.c.scheduleReload(new gsj.a() {
            @Override
            public void a() {
               for (gsk.e $$0 : $$1) {
                  $$0.g = gsk.a.c;
                  if ($$0.e == null) {
                     gsk.this.b.a($$0.a, gsi.a.b);
                  }
               }

               for (gsk.e $$1 : $$2) {
                  $$1.g = gsk.a.a;
               }

               gsk.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (gsk.e $$1 : gsk.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(gsk.d.d);
                           break;
                        case b:
                           $$1.g = gsk.a.a;
                           $$1.a(gsk.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  gsk.this.f();
               } else {
                  for (gsk.e $$2 : gsk.this.f) {
                     if ($$2.g == gsk.a.b) {
                        $$2.g = gsk.a.a;
                     }
                  }
               }
            }

            @Override
            public List<gsj.b> b() {
               return $$1.stream().map($$0 -> new gsj.b($$0.a, $$0.d)).toList();
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
      a(gsi.a.d),
      b(gsi.a.e),
      c(gsi.a.a),
      d(gsi.a.c),
      e(null),
      f(null);

      @Nullable
      final gsi.a g;

      private d(@Nullable final gsi.a $$0) {
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
      gsk.d e;
      gsk.b f = gsk.b.a;
      gsk.a g = gsk.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(gsk.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
