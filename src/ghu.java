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

public class ghu {
   private final ghr a;
   final ghs b;
   private final ght c;
   private final Runnable d;
   private ghu.c e;
   final List<ghu.e> f = new ArrayList<>();

   public ghu(ghr $$0, ghs $$1, ght $$2, Runnable $$3, ghu.c $$4) {
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
      for (ghu.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(ghu.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == ghu.c.c) {
         this.b.a($$0, ghs.a.a);
      } else {
         this.a($$0, new ghu.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == ghu.c.c) {
         this.b.a($$0, ghs.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         ghu.e $$5 = new ghu.e($$0, $$2, null);
         $$5.f = ghu.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, ghu.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == ghu.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(ghu.e $$0) {
      this.b.a($$0.a, ghs.b.a);
      $$0.h = true;
   }

   @Nullable
   private ghu.e c(UUID $$0) {
      for (ghu.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      ghu.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(ghu.d.e);
         this.f();
      }
   }

   public void a() {
      for (ghu.e $$0 : this.f) {
         $$0.a(ghu.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = ghu.c.b;

      for (ghu.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = ghu.c.c;

      for (ghu.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(ghu.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = ghu.c.a;
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
         if ($$0.g != ghu.a.a) {
            return false;
         } else if ($$0.e != null) {
            ghs.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<ghu.e> $$0, aot.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (ghu.e $$2 : this.f) {
            if ($$2.g != ghu.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(ghu.d.a);
               } else {
                  $$2.a(ghu.d.d);
               }
            }
         }
      }

      for (ghu.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = ghu.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, ghs.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<ghu.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (ghu.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != ghu.b.c) {
               $$1 = true;
            }

            if ($$2.f == ghu.b.a) {
               $$2.f = ghu.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, aot.c> $$3 = new HashMap<>();

         for (ghu.e $$4 : $$0) {
            $$3.put($$4.a, new aot.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<ghu.e> $$1 = new ArrayList<>();
      final List<ghu.e> $$2 = new ArrayList<>();

      for (ghu.e $$3 : this.f) {
         if ($$3.g == ghu.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == ghu.b.c && !$$3.a();
         if ($$4 && $$3.g == ghu.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == ghu.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (ghu.e $$5 : $$1) {
            if ($$5.g != ghu.a.c) {
               $$5.g = ghu.a.b;
            }
         }

         for (ghu.e $$6 : $$2) {
            $$6.g = ghu.a.b;
         }

         this.c.scheduleReload(new ght.a() {
            @Override
            public void a() {
               for (ghu.e $$0 : $$1) {
                  $$0.g = ghu.a.c;
                  if ($$0.e == null) {
                     ghu.this.b.a($$0.a, ghs.a.b);
                  }
               }

               for (ghu.e $$1 : $$2) {
                  $$1.g = ghu.a.a;
               }

               ghu.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (ghu.e $$1 : ghu.this.f) {
                     switch ($$1.g) {
                        case c:
                           $$1.add($$1);
                           break;
                        case b:
                           $$1.g = ghu.a.a;
                           $$1.a(ghu.d.b);
                           break;
                        case a:
                           $$1.a(ghu.d.d);
                     }
                  }

                  ghu.this.f();
               } else {
                  for (ghu.e $$2 : ghu.this.f) {
                     if ($$2.g == ghu.a.b) {
                        $$2.g = ghu.a.a;
                     }
                  }
               }
            }

            @Override
            public List<ght.b> b() {
               return $$1.stream().map($$0 -> new ght.b($$0.a, $$0.d)).toList();
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
      a(ghs.a.d),
      b(ghs.a.e),
      c(ghs.a.a),
      d(ghs.a.c),
      e(null),
      f(null);

      @Nullable
      final ghs.a g;

      private d(@Nullable ghs.a $$0) {
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
      ghu.d e;
      ghu.b f = ghu.b.a;
      ghu.a g = ghu.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(ghu.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
