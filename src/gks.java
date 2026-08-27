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

public class gks {
   private final gkp a;
   final gkq b;
   private final gkr c;
   private final Runnable d;
   private gks.c e;
   final List<gks.e> f = new ArrayList<>();

   public gks(gkp $$0, gkq $$1, gkr $$2, Runnable $$3, gks.c $$4) {
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
      for (gks.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(gks.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == gks.c.c) {
         this.b.a($$0, gkq.a.a);
      } else {
         this.a($$0, new gks.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == gks.c.c) {
         this.b.a($$0, gkq.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         gks.e $$5 = new gks.e($$0, $$2, null);
         $$5.f = gks.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, gks.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == gks.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(gks.e $$0) {
      this.b.a($$0.a, gkq.b.a);
      $$0.h = true;
   }

   @Nullable
   private gks.e c(UUID $$0) {
      for (gks.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      gks.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(gks.d.e);
         this.f();
      }
   }

   public void a() {
      for (gks.e $$0 : this.f) {
         $$0.a(gks.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = gks.c.b;

      for (gks.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = gks.c.c;

      for (gks.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(gks.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = gks.c.a;
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
         if ($$0.g != gks.a.a) {
            return false;
         } else if ($$0.e != null) {
            gkq.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<gks.e> $$0, aqp.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (gks.e $$2 : this.f) {
            if ($$2.g != gks.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(gks.d.a);
               } else {
                  $$2.a(gks.d.d);
               }
            }
         }
      }

      for (gks.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = gks.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, gkq.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<gks.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (gks.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != gks.b.c) {
               $$1 = true;
            }

            if ($$2.f == gks.b.a) {
               $$2.f = gks.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, aqp.c> $$3 = new HashMap<>();

         for (gks.e $$4 : $$0) {
            $$3.put($$4.a, new aqp.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<gks.e> $$1 = new ArrayList<>();
      final List<gks.e> $$2 = new ArrayList<>();

      for (gks.e $$3 : this.f) {
         if ($$3.g == gks.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == gks.b.c && !$$3.a();
         if ($$4 && $$3.g == gks.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == gks.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (gks.e $$5 : $$1) {
            if ($$5.g != gks.a.c) {
               $$5.g = gks.a.b;
            }
         }

         for (gks.e $$6 : $$2) {
            $$6.g = gks.a.b;
         }

         this.c.scheduleReload(new gkr.a() {
            @Override
            public void a() {
               for (gks.e $$0 : $$1) {
                  $$0.g = gks.a.c;
                  if ($$0.e == null) {
                     gks.this.b.a($$0.a, gkq.a.b);
                  }
               }

               for (gks.e $$1 : $$2) {
                  $$1.g = gks.a.a;
               }

               gks.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (gks.e $$1 : gks.this.f) {
                     switch ($$1.g) {
                        case c:
                           $$1.add($$1);
                           break;
                        case b:
                           $$1.g = gks.a.a;
                           $$1.a(gks.d.b);
                           break;
                        case a:
                           $$1.a(gks.d.d);
                     }
                  }

                  gks.this.f();
               } else {
                  for (gks.e $$2 : gks.this.f) {
                     if ($$2.g == gks.a.b) {
                        $$2.g = gks.a.a;
                     }
                  }
               }
            }

            @Override
            public List<gkr.b> b() {
               return $$1.stream().map($$0 -> new gkr.b($$0.a, $$0.d)).toList();
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
      a(gkq.a.d),
      b(gkq.a.e),
      c(gkq.a.a),
      d(gkq.a.c),
      e(null),
      f(null);

      @Nullable
      final gkq.a g;

      private d(@Nullable gkq.a $$0) {
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
      gks.d e;
      gks.b f = gks.b.a;
      gks.a g = gks.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(gks.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
