import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class gja implements zj {
   private static final ww k = ww.c("disconnect.lost");
   private static final Logger l = LogUtils.getLogger();
   protected final fof a;
   protected final vp b;
   @Nullable
   protected final gjs c;
   @Nullable
   protected String d;
   protected final hnp e;
   @Nullable
   protected final fxi f;
   protected boolean g;
   private final List<gja.a> m = new ArrayList<>();
   protected final Map<ale, byte[]> h;
   protected Map<String, String> i;
   protected alw j;

   protected gja(fof $$0, vp $$1, gji $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
      this.h = $$2.h();
      this.i = $$2.j();
      this.j = $$2.k();
   }

   @Override
   public void a(zd $$0, Exception $$1) {
      l.error("Failed to handle packet {}, disconnecting", $$0, $$1);
      zj.super.a($$0, $$1);
      Optional<Path> $$2 = this.a($$0, (Throwable)$$1);
      Optional<URI> $$3 = this.j.a(alw.b.a).map(alw.a::c);
      this.b.a(new vr(ww.c("disconnect.packetError"), $$2, $$3));
   }

   @Override
   public vr a(ww $$0, Throwable $$1) {
      Optional<Path> $$2 = this.a(null, $$1);
      Optional<URI> $$3 = this.j.a(alw.b.a).map(alw.a::c);
      return new vr($$0, $$2, $$3);
   }

   private Optional<Path> a(@Nullable zd $$0, Throwable $$1) {
      o $$2 = o.a($$1, "Packet handling error");
      zg.a($$2, this, $$0);
      Path $$3 = this.a.q.toPath().resolve("debug");
      Path $$4 = $$3.resolve("disconnect-" + af.f() + "-client.txt");
      Optional<alw.a> $$5 = this.j.a(alw.b.a);
      List<String> $$6 = $$5.<List<String>>map($$0x -> List.of("Server bug reporting link: " + $$0x.c())).orElse(List.of());
      return $$2.a($$4, y.d, $$6) ? Optional.of($$4) : Optional.empty();
   }

   @Override
   public boolean a(zd<?> $$0) {
      return zj.super.a($$0) ? true : this.g && ($$0 instanceof zs || $$0 instanceof zt);
   }

   @Override
   public void a(zn $$0) {
      this.a(new zz($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(zo $$0) {
      zg.a($$0, this, this.a);
      this.b(new aaa($$0.b()));
   }

   @Override
   public void a(zk $$0) {
      aag $$1 = $$0.b();
      if (!($$1 instanceof aah)) {
         zg.a($$0, this, this.a);
         if ($$1 instanceof aae $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(aag var1);

   @Override
   public void a(zq $$0) {
      zg.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new aab($$1, aab.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         gjs.a $$5 = this.c != null ? this.c.b() : gjs.a.c;
         if ($$5 != gjs.a.c && (!$$4 || $$5 != gjs.a.b)) {
            this.a.af().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(zp $$0) {
      zg.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.af().a($$0x), () -> this.a.af().e());
   }

   static ww a(ww $$0, @Nullable ww $$1) {
      return (ww)($$1 == null ? $$0 : ww.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
   }

   @Nullable
   private static URL a(String $$0) {
      try {
         URL $$1 = new URL($$0);
         String $$2 = $$1.getProtocol();
         return !"http".equals($$2) && !"https".equals($$2) ? null : $$1;
      } catch (MalformedURLException var3) {
         return null;
      }
   }

   @Override
   public void a(abn $$0) {
      zg.a($$0, this, this.a);
      this.b.a(new abq($$0.b(), this.h.get($$0.b())));
   }

   @Override
   public void a(zs $$0) {
      zg.a($$0, this, this.a);
      this.h.put($$0.b(), $$0.e());
   }

   @Override
   public void a(zl $$0) {
      zg.a($$0, this, this.a);
      this.i = $$0.b();
   }

   @Override
   public void a(zr $$0) {
      zg.a($$0, this, this.a);
      List<alw.c> $$1 = $$0.b();
      Builder<alw.a> $$2 = ImmutableList.builderWithExpectedSize($$1.size());

      for (alw.c $$3 : $$1) {
         try {
            URI $$4 = af.a($$3.b());
            $$2.add(new alw.a($$3.a(), $$4));
         } catch (Exception var7) {
            l.warn("Received invalid link for type {}:{}", new Object[]{$$3.a(), $$3.b(), var7});
         }
      }

      this.j = new alw($$2.build());
   }

   @Override
   public void a(zt $$0) {
      this.g = true;
      zg.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.b.a(ww.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         gkv $$1 = new gkv($$0.b(), $$0.e());
         fwh.a(Objects.requireNonNullElseGet(this.f, fxk::new), this.a, $$1, this.c, false, new gjw(this.h));
      }
   }

   @Override
   public void a(zm $$0) {
      this.b.a($$0.b());
   }

   protected void e() {
      Iterator<gja.a> $$0 = this.m.iterator();

      while ($$0.hasNext()) {
         gja.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= af.c()) {
            $$0.remove();
         }
      }
   }

   public void b(zd<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(vr $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      l.warn("Client disconnected with reason: {}", $$0.a().getString());
   }

   @Override
   public void a(o $$0, p $$1) {
      $$1.a("Is Local", () -> String.valueOf(this.b.e()));
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$1.a("Server brand", () -> this.d);
      if (!this.i.isEmpty()) {
         p $$2 = $$0.a("Custom Server Details");
         this.i.forEach($$2::a);
      }
   }

   protected fxi b(vr $$0) {
      fxi $$1 = Objects.requireNonNullElseGet(this.f, () -> new gaa(new fxk()));
      return (fxi)(this.c != null && this.c.e() ? new hoi($$1, k, $$0.a()) : new fwp($$1, k, $$0));
   }

   @Nullable
   public String f() {
      return this.d;
   }

   private void a(zd<? extends wi> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.m.add(new gja.a($$0, $$1, af.c() + $$2.toMillis()));
      }
   }

   private fxi a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable ww $$4) {
      fxi $$5 = this.a.z;
      return $$5 instanceof gja.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new gja.b(this.a, $$5, List.of(new gja.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(zd<? extends wi> a, BooleanSupplier b, long c) {
   }

   class b extends fwg {
      private final List<gja.b.a> s;
      @Nullable
      private final fxi u;

      b(final fof $$0, @Nullable final fxi $$1, final List<gja.b.a> $$2, final boolean $$3, @Nullable final ww $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               hky $$6 = $$0.af();
               if ($$5) {
                  if (gja.this.c != null) {
                     gja.this.c.a(gjs.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     gja.this.b.a(ww.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (gja.this.c != null) {
                     gja.this.c.a(gjs.a.b);
                  }
               }

               for (gja.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (gja.this.c != null) {
                  gjt.b(gja.this.c);
               }
            },
            $$3 ? ww.c("multiplayer.requiredTexturePrompt.line1") : ww.c("multiplayer.texturePrompt.line1"),
            gja.a($$3 ? ww.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : ww.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? wv.i : wv.f,
            $$3 ? wv.p : wv.g
         );
         this.s = $$2;
         this.u = $$1;
      }

      public gja.b a(fof $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable ww $$5) {
         List<gja.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.s.size() + 1).addAll(this.s).add(new gja.b.a($$1, $$2, $$3)).build();
         return gja.this.new b($$0, this.u, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
