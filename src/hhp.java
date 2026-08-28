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

public class hhp {
   private final hhm a;
   final hhn b;
   private final hho c;
   private final Runnable d;
   private hhp.c e;
   final List<hhp.e> f = new ArrayList<>();

   public hhp(hhm $$0, hhn $$1, hho $$2, Runnable $$3, hhp.c $$4) {
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
      for (hhp.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(hhp.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == hhp.c.c) {
         this.b.a($$0, hhn.a.a);
      } else {
         this.a($$0, new hhp.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == hhp.c.c) {
         this.b.a($$0, hhn.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         hhp.e $$5 = new hhp.e($$0, $$2, null);
         $$5.f = hhp.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, hhp.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == hhp.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(hhp.e $$0) {
      this.b.a($$0.a, hhn.b.a);
      $$0.h = true;
   }

   @Nullable
   private hhp.e c(UUID $$0) {
      for (hhp.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      hhp.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(hhp.d.e);
         this.f();
      }
   }

   public void a() {
      for (hhp.e $$0 : this.f) {
         $$0.a(hhp.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = hhp.c.b;

      for (hhp.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = hhp.c.c;

      for (hhp.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(hhp.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = hhp.c.a;
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
         if ($$0.g != hhp.a.a) {
            return false;
         } else if ($$0.e != null) {
            hhn.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<hhp.e> $$0, asw.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (hhp.e $$2 : this.f) {
            if ($$2.g != hhp.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(hhp.d.a);
               } else {
                  $$2.a(hhp.d.d);
               }
            }
         }
      }

      for (hhp.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = hhp.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, hhn.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<hhp.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (hhp.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != hhp.b.c) {
               $$1 = true;
            }

            if ($$2.f == hhp.b.a) {
               $$2.f = hhp.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, asw.c> $$3 = new HashMap<>();

         for (hhp.e $$4 : $$0) {
            $$3.put($$4.a, new asw.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<hhp.e> $$1 = new ArrayList<>();
      final List<hhp.e> $$2 = new ArrayList<>();

      for (hhp.e $$3 : this.f) {
         if ($$3.g == hhp.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == hhp.b.c && !$$3.a();
         if ($$4 && $$3.g == hhp.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == hhp.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (hhp.e $$5 : $$1) {
            if ($$5.g != hhp.a.c) {
               $$5.g = hhp.a.b;
            }
         }

         for (hhp.e $$6 : $$2) {
            $$6.g = hhp.a.b;
         }

         this.c.scheduleReload(new hho.a() {
            @Override
            public void a() {
               for (hhp.e $$0 : $$1) {
                  $$0.g = hhp.a.c;
                  if ($$0.e == null) {
                     hhp.this.b.a($$0.a, hhn.a.b);
                  }
               }

               for (hhp.e $$1 : $$2) {
                  $$1.g = hhp.a.a;
               }

               hhp.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (hhp.e $$1 : hhp.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(hhp.d.d);
                           break;
                        case b:
                           $$1.g = hhp.a.a;
                           $$1.a(hhp.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  hhp.this.f();
               } else {
                  for (hhp.e $$2 : hhp.this.f) {
                     if ($$2.g == hhp.a.b) {
                        $$2.g = hhp.a.a;
                     }
                  }
               }
            }

            @Override
            public List<hho.b> b() {
               return $$1.stream().map($$0 -> new hho.b($$0.a, $$0.d)).toList();
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
      a(hhn.a.d),
      b(hhn.a.e),
      c(hhn.a.a),
      d(hhn.a.c),
      e(null),
      f(null);

      @Nullable
      final hhn.a g;

      private d(@Nullable final hhn.a $$0) {
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
      hhp.d e;
      hhp.b f = hhp.b.a;
      hhp.a g = hhp.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(hhp.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
