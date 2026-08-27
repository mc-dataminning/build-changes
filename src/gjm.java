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

public class gjm {
   private final gjj a;
   final gjk b;
   private final gjl c;
   private final Runnable d;
   private gjm.c e;
   final List<gjm.e> f = new ArrayList<>();

   public gjm(gjj $$0, gjk $$1, gjl $$2, Runnable $$3, gjm.c $$4) {
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
      for (gjm.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(gjm.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == gjm.c.c) {
         this.b.a($$0, gjk.a.a);
      } else {
         this.a($$0, new gjm.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == gjm.c.c) {
         this.b.a($$0, gjk.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         gjm.e $$5 = new gjm.e($$0, $$2, null);
         $$5.f = gjm.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, gjm.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == gjm.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(gjm.e $$0) {
      this.b.a($$0.a, gjk.b.a);
      $$0.h = true;
   }

   @Nullable
   private gjm.e c(UUID $$0) {
      for (gjm.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      gjm.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(gjm.d.e);
         this.f();
      }
   }

   public void a() {
      for (gjm.e $$0 : this.f) {
         $$0.a(gjm.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = gjm.c.b;

      for (gjm.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = gjm.c.c;

      for (gjm.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(gjm.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = gjm.c.a;
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
         if ($$0.g != gjm.a.a) {
            return false;
         } else if ($$0.e != null) {
            gjk.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<gjm.e> $$0, aqk.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (gjm.e $$2 : this.f) {
            if ($$2.g != gjm.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(gjm.d.a);
               } else {
                  $$2.a(gjm.d.d);
               }
            }
         }
      }

      for (gjm.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = gjm.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, gjk.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<gjm.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (gjm.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != gjm.b.c) {
               $$1 = true;
            }

            if ($$2.f == gjm.b.a) {
               $$2.f = gjm.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, aqk.c> $$3 = new HashMap<>();

         for (gjm.e $$4 : $$0) {
            $$3.put($$4.a, new aqk.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<gjm.e> $$1 = new ArrayList<>();
      final List<gjm.e> $$2 = new ArrayList<>();

      for (gjm.e $$3 : this.f) {
         if ($$3.g == gjm.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == gjm.b.c && !$$3.a();
         if ($$4 && $$3.g == gjm.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == gjm.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (gjm.e $$5 : $$1) {
            if ($$5.g != gjm.a.c) {
               $$5.g = gjm.a.b;
            }
         }

         for (gjm.e $$6 : $$2) {
            $$6.g = gjm.a.b;
         }

         this.c.scheduleReload(new gjl.a() {
            @Override
            public void a() {
               for (gjm.e $$0 : $$1) {
                  $$0.g = gjm.a.c;
                  if ($$0.e == null) {
                     gjm.this.b.a($$0.a, gjk.a.b);
                  }
               }

               for (gjm.e $$1 : $$2) {
                  $$1.g = gjm.a.a;
               }

               gjm.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (gjm.e $$1 : gjm.this.f) {
                     switch ($$1.g) {
                        case c:
                           $$1.add($$1);
                           break;
                        case b:
                           $$1.g = gjm.a.a;
                           $$1.a(gjm.d.b);
                           break;
                        case a:
                           $$1.a(gjm.d.d);
                     }
                  }

                  gjm.this.f();
               } else {
                  for (gjm.e $$2 : gjm.this.f) {
                     if ($$2.g == gjm.a.b) {
                        $$2.g = gjm.a.a;
                     }
                  }
               }
            }

            @Override
            public List<gjl.b> b() {
               return $$1.stream().map($$0 -> new gjl.b($$0.a, $$0.d)).toList();
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
      a(gjk.a.d),
      b(gjk.a.e),
      c(gjk.a.a),
      d(gjk.a.c),
      e(null),
      f(null);

      @Nullable
      final gjk.a g;

      private d(@Nullable gjk.a $$0) {
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
      gjm.d e;
      gjm.b f = gjm.b.a;
      gjm.a g = gjm.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(gjm.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
