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

public class gjn {
   private final gjk a;
   final gjl b;
   private final gjm c;
   private final Runnable d;
   private gjn.c e;
   final List<gjn.e> f = new ArrayList<>();

   public gjn(gjk $$0, gjl $$1, gjm $$2, Runnable $$3, gjn.c $$4) {
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
      for (gjn.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(gjn.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == gjn.c.c) {
         this.b.a($$0, gjl.a.a);
      } else {
         this.a($$0, new gjn.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == gjn.c.c) {
         this.b.a($$0, gjl.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         gjn.e $$5 = new gjn.e($$0, $$2, null);
         $$5.f = gjn.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, gjn.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == gjn.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(gjn.e $$0) {
      this.b.a($$0.a, gjl.b.a);
      $$0.h = true;
   }

   @Nullable
   private gjn.e c(UUID $$0) {
      for (gjn.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      gjn.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(gjn.d.e);
         this.f();
      }
   }

   public void a() {
      for (gjn.e $$0 : this.f) {
         $$0.a(gjn.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = gjn.c.b;

      for (gjn.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = gjn.c.c;

      for (gjn.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(gjn.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = gjn.c.a;
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
         if ($$0.g != gjn.a.a) {
            return false;
         } else if ($$0.e != null) {
            gjl.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<gjn.e> $$0, aqk.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (gjn.e $$2 : this.f) {
            if ($$2.g != gjn.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(gjn.d.a);
               } else {
                  $$2.a(gjn.d.d);
               }
            }
         }
      }

      for (gjn.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = gjn.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, gjl.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<gjn.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (gjn.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != gjn.b.c) {
               $$1 = true;
            }

            if ($$2.f == gjn.b.a) {
               $$2.f = gjn.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, aqk.c> $$3 = new HashMap<>();

         for (gjn.e $$4 : $$0) {
            $$3.put($$4.a, new aqk.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<gjn.e> $$1 = new ArrayList<>();
      final List<gjn.e> $$2 = new ArrayList<>();

      for (gjn.e $$3 : this.f) {
         if ($$3.g == gjn.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == gjn.b.c && !$$3.a();
         if ($$4 && $$3.g == gjn.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == gjn.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (gjn.e $$5 : $$1) {
            if ($$5.g != gjn.a.c) {
               $$5.g = gjn.a.b;
            }
         }

         for (gjn.e $$6 : $$2) {
            $$6.g = gjn.a.b;
         }

         this.c.scheduleReload(new gjm.a() {
            @Override
            public void a() {
               for (gjn.e $$0 : $$1) {
                  $$0.g = gjn.a.c;
                  if ($$0.e == null) {
                     gjn.this.b.a($$0.a, gjl.a.b);
                  }
               }

               for (gjn.e $$1 : $$2) {
                  $$1.g = gjn.a.a;
               }

               gjn.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (gjn.e $$1 : gjn.this.f) {
                     switch ($$1.g) {
                        case c:
                           $$1.add($$1);
                           break;
                        case b:
                           $$1.g = gjn.a.a;
                           $$1.a(gjn.d.b);
                           break;
                        case a:
                           $$1.a(gjn.d.d);
                     }
                  }

                  gjn.this.f();
               } else {
                  for (gjn.e $$2 : gjn.this.f) {
                     if ($$2.g == gjn.a.b) {
                        $$2.g = gjn.a.a;
                     }
                  }
               }
            }

            @Override
            public List<gjm.b> b() {
               return $$1.stream().map($$0 -> new gjm.b($$0.a, $$0.d)).toList();
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
      a(gjl.a.d),
      b(gjl.a.e),
      c(gjl.a.a),
      d(gjl.a.c),
      e(null),
      f(null);

      @Nullable
      final gjl.a g;

      private d(@Nullable gjl.a $$0) {
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
      gjn.d e;
      gjn.b f = gjn.b.a;
      gjn.a g = gjn.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(gjn.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
