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

public class gru {
   private final grr a;
   final grs b;
   private final grt c;
   private final Runnable d;
   private gru.c e;
   final List<gru.e> f = new ArrayList<>();

   public gru(grr $$0, grs $$1, grt $$2, Runnable $$3, gru.c $$4) {
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
      for (gru.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(gru.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == gru.c.c) {
         this.b.a($$0, grs.a.a);
      } else {
         this.a($$0, new gru.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == gru.c.c) {
         this.b.a($$0, grs.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         gru.e $$5 = new gru.e($$0, $$2, null);
         $$5.f = gru.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, gru.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == gru.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(gru.e $$0) {
      this.b.a($$0.a, grs.b.a);
      $$0.h = true;
   }

   @Nullable
   private gru.e c(UUID $$0) {
      for (gru.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      gru.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(gru.d.e);
         this.f();
      }
   }

   public void a() {
      for (gru.e $$0 : this.f) {
         $$0.a(gru.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = gru.c.b;

      for (gru.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = gru.c.c;

      for (gru.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(gru.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = gru.c.a;
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
         if ($$0.g != gru.a.a) {
            return false;
         } else if ($$0.e != null) {
            grs.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<gru.e> $$0, asw.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (gru.e $$2 : this.f) {
            if ($$2.g != gru.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(gru.d.a);
               } else {
                  $$2.a(gru.d.d);
               }
            }
         }
      }

      for (gru.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = gru.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, grs.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<gru.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (gru.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != gru.b.c) {
               $$1 = true;
            }

            if ($$2.f == gru.b.a) {
               $$2.f = gru.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, asw.c> $$3 = new HashMap<>();

         for (gru.e $$4 : $$0) {
            $$3.put($$4.a, new asw.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<gru.e> $$1 = new ArrayList<>();
      final List<gru.e> $$2 = new ArrayList<>();

      for (gru.e $$3 : this.f) {
         if ($$3.g == gru.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == gru.b.c && !$$3.a();
         if ($$4 && $$3.g == gru.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == gru.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (gru.e $$5 : $$1) {
            if ($$5.g != gru.a.c) {
               $$5.g = gru.a.b;
            }
         }

         for (gru.e $$6 : $$2) {
            $$6.g = gru.a.b;
         }

         this.c.scheduleReload(new grt.a() {
            @Override
            public void a() {
               for (gru.e $$0 : $$1) {
                  $$0.g = gru.a.c;
                  if ($$0.e == null) {
                     gru.this.b.a($$0.a, grs.a.b);
                  }
               }

               for (gru.e $$1 : $$2) {
                  $$1.g = gru.a.a;
               }

               gru.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (gru.e $$1 : gru.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(gru.d.d);
                           break;
                        case b:
                           $$1.g = gru.a.a;
                           $$1.a(gru.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  gru.this.f();
               } else {
                  for (gru.e $$2 : gru.this.f) {
                     if ($$2.g == gru.a.b) {
                        $$2.g = gru.a.a;
                     }
                  }
               }
            }

            @Override
            public List<grt.b> b() {
               return $$1.stream().map($$0 -> new grt.b($$0.a, $$0.d)).toList();
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
      a(grs.a.d),
      b(grs.a.e),
      c(grs.a.a),
      d(grs.a.c),
      e(null),
      f(null);

      @Nullable
      final grs.a g;

      private d(@Nullable final grs.a $$0) {
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
      gru.d e;
      gru.b f = gru.b.a;
      gru.a g = gru.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(gru.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
