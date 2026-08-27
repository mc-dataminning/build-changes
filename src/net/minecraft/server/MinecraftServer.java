package net.minecraft.server;

import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.net.Proxy;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyPair;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import net.minecraft.obfuscate.DontObfuscate;
import org.slf4j.Logger;

public abstract class MinecraftServer extends bip<ahx> implements ahs, dr, AutoCloseable {
   private static final Logger l = LogUtils.getLogger();
   public static final String b = "vanilla";
   private static final float m = 0.8F;
   private static final int n = 100;
   private static final long o = 20L * avj.a / 20L;
   private static final int p = 20;
   private static final long q = 10L * avj.a;
   private static final int r = 100;
   private static final long s = 5L * avj.a;
   private static final long t = 10L * avj.b;
   private static final int u = 12;
   public static final int c = 11;
   private static final int v = 441;
   private static final int w = 6000;
   private static final int x = 100;
   private static final int y = 3;
   public static final int d = 29999984;
   public static final ctm e = new ctm("Demo World", ctf.a, false, bjs.c, false, new cte(), cuc.c);
   public static final GameProfile f = new GameProfile(ac.d, "Anonymous Player");
   protected final egf.c g;
   protected final egi h;
   private final List<Runnable> z = Lists.newArrayList();
   private bhx A = bhw.a;
   private bgm B = this.A.f();
   private Consumer<bgl> C = $$0x -> this.aT();
   private Consumer<Path> D = $$0x -> {
   };
   private boolean E;
   @Nullable
   private MinecraftServer.c F;
   private boolean G;
   private final anx H;
   private final anj I;
   @Nullable
   private age J;
   @Nullable
   private age.a K;
   private final aup L = aup.a();
   private final DataFixer M;
   private String N;
   private int O = -1;
   private final io<ahm> P;
   private final Map<ahc<cti>, amz> Q = Maps.newLinkedHashMap();
   private aqp R;
   private volatile boolean S = true;
   private boolean T;
   private int U;
   private int V = 6000;
   protected final Proxy i;
   private boolean W;
   private boolean X;
   private boolean Y;
   private boolean Z;
   @Nullable
   private String aa;
   private int ab;
   private final long[] ac = new long[100];
   private long ad = 0L;
   @Nullable
   private KeyPair ae;
   @Nullable
   private GameProfile af;
   private boolean ag;
   private volatile boolean ah;
   private long ai;
   protected final ahw j;
   private long aj;
   private final Thread ak;
   private long al = ac.c();
   private long am;
   private boolean an;
   private final apn ao;
   private final ahu ap = new ahu(this);
   @Nullable
   private efx aq;
   private final aid ar = new aid();
   private final ahr as;
   private boolean at;
   private float au;
   private final Executor av;
   @Nullable
   private String aw;
   private MinecraftServer.a ax;
   private final eda ay;
   private final ahv az;
   protected final egl k;
   private volatile boolean aA;

   public static <S extends MinecraftServer> S a(Function<Thread, S> $$0) {
      AtomicReference<S> $$1 = new AtomicReference<>();
      Thread $$2 = new Thread(() -> $$1.get().w(), "Server thread");
      $$2.setUncaughtExceptionHandler(($$0x, $$1x) -> l.error("Uncaught exception in server thread", $$1x));
      if (Runtime.getRuntime().availableProcessors() > 4) {
         $$2.setPriority(8);
      }

      S $$3 = (S)$$0.apply($$2);
      $$1.set($$3);
      $$2.start();
      return $$3;
   }

   public MinecraftServer(Thread $$0, egf.c $$1, apn $$2, ahz $$3, Proxy $$4, DataFixer $$5, ahw $$6, anj $$7) {
      super("Server");
      this.P = $$3.c();
      this.k = $$3.d();
      if (!this.P.a().d(ke.aN).c(dmk.b)) {
         throw new IllegalStateException("Missing Overworld dimension data");
      } else {
         this.i = $$4;
         this.ao = $$2;
         this.ax = new MinecraftServer.a($$3.a(), $$3.b());
         this.j = $$6;
         if ($$6.e() != null) {
            $$6.e().a(this);
         }

         this.H = new anx(this);
         this.az = new ahv(this);
         this.I = $$7;
         this.g = $$1;
         this.h = $$1.e();
         this.M = $$5;
         this.as = new ahr(this, this.ax.b.a());
         ii<cwj> $$8 = this.P.a().d(ke.f).p().a(this.k.M());
         this.ay = new eda($$3.a(), $$1, $$5, $$8);
         this.ak = $$0;
         this.av = ac.f();
      }
   }

   private void a(ega $$0) {
      $$0.a(this.aH().b(), "scoreboard");
   }

   protected abstract boolean e() throws IOException;

   protected void u_() {
      if (!bgs.e.c()) {
      }

      boolean $$0 = false;
      bgv $$1 = bgs.e.e();
      this.k.a(this.getServerModName(), this.M().a());
      ani $$2 = this.I.create(11);
      this.a($$2);
      this.r();
      this.b($$2);
      if ($$1 != null) {
         $$1.finish();
      }

      if ($$0) {
         try {
            bgs.e.b();
         } catch (Throwable var5) {
            l.warn("Failed to stop JFR profiling", var5);
         }
      }
   }

   protected void r() {
   }

   protected void a(ani $$0) {
      egk $$1 = this.k.K();
      boolean $$2 = this.k.C();
      it<dmk> $$3 = this.P.a().d(ke.aN);
      dph $$4 = this.k.A();
      long $$5 = $$4.b();
      long $$6 = cuj.a($$5);
      List<csv> $$7 = ImmutableList.of(new dov(), new dou(), new cek(), new bxe(), new cev($$1));
      dmk $$8 = $$3.a(dmk.b);
      amz $$9 = new amz(this, this.av, this.g, $$1, cti.h, $$8, $$0, $$2, $$6, $$7, true, null);
      this.Q.put(cti.h, $$9);
      ega $$10 = $$9.u();
      this.a($$10);
      this.aq = new efx($$10);
      dkr $$11 = $$9.D_();
      if (!$$1.p()) {
         try {
            a($$9, $$1, $$4.d(), $$2);
            $$1.c(true);
            if ($$2) {
               this.a(this.k);
            }
         } catch (Throwable var23) {
            o $$13 = o.a(var23, "Exception initializing level");

            try {
               $$9.a($$13);
            } catch (Throwable var22) {
            }

            throw new y($$13);
         }

         $$1.c(true);
      }

      this.ae().a($$9);
      if (this.k.G() != null) {
         this.aL().a(this.k.G());
      }

      bkb $$14 = $$9.J();

      for (Entry<ahc<dmk>, dmk> $$15 : $$3.g()) {
         ahc<dmk> $$16 = $$15.getKey();
         if ($$16 != dmk.b) {
            ahc<cti> $$17 = ahc.a(ke.aM, $$16.a());
            efz $$18 = new efz(this.k, $$1);
            amz $$19 = new amz(this, this.av, this.g, $$18, $$17, $$15.getValue(), $$0, $$2, $$6, ImmutableList.of(), false, $$14);
            $$11.a(new dkp.a($$19.D_()));
            this.Q.put($$17, $$19);
         }
      }

      $$11.a($$1.r());
   }

   private static void a(amz $$0, egk $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         $$1.a(hx.b.b(80), 0.0F);
      } else {
         amx $$4 = $$0.l();
         csp $$5 = new csp($$4.i().b().a());
         int $$6 = $$4.g().a($$0);
         if ($$6 < $$0.J_()) {
            hx $$7 = $$5.l();
            $$6 = $$0.a(doj.a.b, $$7.u() + 8, $$7.w() + 8);
         }

         $$1.a($$5.l().b(8, $$6, 8), 0.0F);
         int $$8 = 0;
         int $$9 = 0;
         int $$10 = 0;
         int $$11 = -1;
         int $$12 = 5;

         for (int $$13 = 0; $$13 < aui.h(11); $$13++) {
            if ($$8 >= -5 && $$8 <= 5 && $$9 >= -5 && $$9 <= 5) {
               hx $$14 = amu.a($$0, new csp($$5.e + $$8, $$5.f + $$9));
               if ($$14 != null) {
                  $$1.a($$14, 0.0F);
                  break;
               }
            }

            if ($$8 == $$9 || $$8 < 0 && $$8 == -$$9 || $$8 > 0 && $$8 == 1 - $$9) {
               int $$15 = $$10;
               $$10 = -$$11;
               $$11 = $$15;
            }

            $$8 += $$10;
            $$9 += $$11;
         }

         if ($$2) {
            $$0.I_().c(ke.aw).flatMap($$0x -> $$0x.b(qi.m)).ifPresent($$3x -> ((dra)$$3x.a()).a($$0, $$4.g(), $$0.z, new hx($$1.a(), $$1.b(), $$1.c())));
         }
      }
   }

   private void a(egl $$0) {
      $$0.a(bjs.a);
      $$0.d(true);
      egk $$1 = $$0.K();
      $$1.b(false);
      $$1.a(false);
      $$1.a(1000000000);
      $$1.b(6000L);
      $$1.a(ctf.d);
   }

   private void b(ani $$0) {
      amz $$1 = this.F();
      l.info("Preparing start region for dimension {}", $$1.ae().a());
      hx $$2 = $$1.T();
      $$0.a(new csp($$2));
      amx $$3 = $$1.l();
      this.al = ac.c();
      $$3.a(ane.a, new csp($$2), 11, avm.a);

      while ($$3.b() != 441) {
         this.al = ac.c() + t;
         this.w_();
      }

      this.al = ac.c() + t;
      this.w_();

      for (amz $$4 : this.Q.values()) {
         ctd $$5 = $$4.u().b(ctd.a(), "chunks");
         if ($$5 != null) {
            LongIterator $$6 = $$5.b().iterator();

            while ($$6.hasNext()) {
               long $$7 = $$6.nextLong();
               csp $$8 = new csp($$7);
               $$4.l().a($$8, true);
            }
         }
      }

      this.al = ac.c() + t;
      this.w_();
      $$0.b();
      this.by();
   }

   public ctf v_() {
      return this.k.m();
   }

   public boolean h() {
      return this.k.n();
   }

   public abstract int i();

   public abstract int j();

   public abstract boolean k();

   public boolean a(boolean $$0, boolean $$1, boolean $$2) {
      boolean $$3 = false;

      for (amz $$4 : this.H()) {
         if (!$$0) {
            l.info("Saving chunks for level '{}'/{}", $$4, $$4.ae().a());
         }

         $$4.a(null, $$1, $$4.e && !$$2);
         $$3 = true;
      }

      amz $$5 = this.F();
      egk $$6 = this.k.K();
      $$6.a($$5.D_().t());
      this.k.a(this.aL().c());
      this.g.a(this.aZ(), this.k, this.ae().r());
      if ($$1) {
         for (amz $$7 : this.H()) {
            l.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", $$7.l().a.n());
         }

         l.info("ThreadedAnvilChunkStorage: All dimensions are saved");
      }

      return $$3;
   }

   public boolean b(boolean $$0, boolean $$1, boolean $$2) {
      boolean var4;
      try {
         this.aA = true;
         this.ae().h();
         var4 = this.a($$0, $$1, $$2);
      } finally {
         this.aA = false;
      }

      return var4;
   }

   @Override
   public void close() {
      this.t();
   }

   public void t() {
      if (this.A.e()) {
         this.aV();
      }

      l.info("Stopping server");
      this.af().b();
      this.aA = true;
      if (this.R != null) {
         l.info("Saving players");
         this.R.h();
         this.R.s();
      }

      l.info("Saving worlds");

      for (amz $$0 : this.H()) {
         if ($$0 != null) {
            $$0.e = false;
         }
      }

      while (this.Q.values().stream().anyMatch($$0x -> $$0x.l().a.f())) {
         this.al = ac.c() + avj.b;

         for (amz $$1 : this.H()) {
            $$1.l().o();
            $$1.l().a(() -> true, false);
         }

         this.w_();
      }

      this.a(false, true, false);

      for (amz $$2 : this.H()) {
         if ($$2 != null) {
            try {
               $$2.close();
            } catch (IOException var5) {
               l.error("Exception closing the level", var5);
            }
         }
      }

      this.aA = false;
      this.ax.close();

      try {
         this.g.close();
      } catch (IOException var4) {
         l.error("Failed to unlock level {}", this.g.d(), var4);
      }
   }

   public String u() {
      return this.N;
   }

   public void a_(String $$0) {
      this.N = $$0;
   }

   public boolean v() {
      return this.S;
   }

   public void a(boolean $$0) {
      this.S = false;
      if ($$0) {
         try {
            this.ak.join();
         } catch (InterruptedException var3) {
            l.error("Error while shutting down", var3);
         }
      }
   }

   protected void w() {
      try {
         if (!this.e()) {
            throw new IllegalStateException("Failed to initialize server");
         }

         this.al = ac.c();
         this.K = this.bm().orElse(null);
         this.J = this.bo();

         while (this.S) {
            long $$0;
            if (!this.A() && this.az.a() && this.az.d()) {
               $$0 = 0L;
               this.al = ac.c();
               this.ai = this.al;
            } else {
               $$0 = this.az.h();
               long $$2 = ac.c() - this.al;
               if ($$2 > o + 20L * $$0 && this.al - this.ai >= q + 100L * $$0) {
                  long $$3 = $$2 / $$0;
                  l.warn("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind", $$2 / avj.b, $$3);
                  this.al += $$3 * $$0;
                  this.ai = this.al;
               }
            }

            boolean $$4 = $$0 == 0L;
            if (this.G) {
               this.G = false;
               this.F = new MinecraftServer.c(ac.c(), this.U);
            }

            this.al += $$0;
            this.bz();
            this.B.a("tick");
            this.a($$4 ? () -> false : this::bk);
            this.B.b("nextTickWait");
            this.an = true;
            this.am = Math.max(ac.c() + $$0, this.al);
            this.w_();
            if ($$4) {
               this.az.e();
            }

            this.B.c();
            this.bA();
            this.ah = true;
            bgs.e.a(this.au);
         }
      } catch (Throwable var46) {
         l.error("Encountered an unexpected exception", var46);
         o $$7 = a(var46);
         this.b($$7.g());
         File $$8 = new File(new File(this.z(), "crash-reports"), "crash-" + ac.e() + "-server.txt");
         if ($$7.a($$8)) {
            l.error("This crash report has been saved to: {}", $$8.getAbsolutePath());
         } else {
            l.error("We were unable to save this crash report to disk.");
         }

         this.a($$7);
      } finally {
         try {
            this.T = true;
            this.t();
         } catch (Throwable var44) {
            l.error("Exception stopping the server", var44);
         } finally {
            if (this.j.e() != null) {
               this.j.e().a();
            }

            this.g();
         }
      }
   }

   private static o a(Throwable $$0) {
      y $$1 = null;

      for (Throwable $$2 = $$0; $$2 != null; $$2 = $$2.getCause()) {
         if ($$2 instanceof y $$3) {
            $$1 = $$3;
         }
      }

      o $$4;
      if ($$1 != null) {
         $$4 = $$1.a();
         if ($$1 != $$0) {
            $$4.a("Wrapped in").a("Wrapping exception", $$0);
         }
      } else {
         $$4 = new o("Exception in server tick loop", $$0);
      }

      return $$4;
   }

   private boolean bk() {
      return this.bw() || ac.c() < (this.an ? this.am : this.al);
   }

   protected void w_() {
      this.bu();
      this.c(() -> !this.bk());
   }

   protected ahx a(Runnable $$0) {
      return new ahx(this.U, $$0);
   }

   protected boolean a(ahx $$0) {
      return $$0.a() + 3 < this.U || this.bk();
   }

   @Override
   public boolean x() {
      boolean $$0 = this.bl();
      this.an = $$0;
      return $$0;
   }

   private boolean bl() {
      if (super.x()) {
         return true;
      } else {
         if (this.az.a() || this.bk()) {
            for (amz $$0 : this.H()) {
               if ($$0.l().d()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   protected void b(ahx $$0) {
      this.aR().d("runTask");
      super.d($$0);
   }

   private Optional<age.a> bm() {
      Optional<Path> $$0 = Optional.of(this.c("server-icon.png").toPath())
         .filter($$0x -> Files.isRegularFile($$0x))
         .or(() -> this.g.h().filter($$0x -> Files.isRegularFile($$0x)));
      return $$0.flatMap($$0x -> {
         try {
            BufferedImage $$1 = ImageIO.read($$0x.toFile());
            Preconditions.checkState($$1.getWidth() == 64, "Must be 64 pixels wide");
            Preconditions.checkState($$1.getHeight() == 64, "Must be 64 pixels high");
            ByteArrayOutputStream $$2 = new ByteArrayOutputStream();
            ImageIO.write($$1, "PNG", $$2);
            return Optional.of(new age.a($$2.toByteArray()));
         } catch (Exception var3) {
            l.error("Couldn't load server icon", var3);
            return Optional.empty();
         }
      });
   }

   public Optional<Path> y() {
      return this.g.h();
   }

   public File z() {
      return new File(".");
   }

   public void a(o $$0) {
   }

   public void g() {
   }

   public boolean A() {
      return false;
   }

   public void a(BooleanSupplier $$0) {
      long $$1 = ac.c();
      this.U++;
      this.az.m();
      this.b($$0);
      if ($$1 - this.aj >= s) {
         this.aj = $$1;
         this.J = this.bo();
      }

      this.V--;
      if (this.V <= 0) {
         this.V = this.bn();
         l.debug("Autosave started");
         this.B.a("save");
         this.b(true, false, false);
         this.B.c();
         l.debug("Autosave finished");
      }

      this.B.a("tallying");
      long $$2 = ac.c() - $$1;
      int $$3 = this.U % 100;
      this.ad = this.ad - this.ac[$$3];
      this.ad += $$2;
      this.ac[$$3] = $$2;
      this.au = this.au * 0.8F + (float)$$2 / (float)avj.b * 0.19999999F;
      long $$4 = ac.c();
      this.a($$4 - $$1);
      this.B.c();
   }

   private int bn() {
      float $$1;
      if (this.az.a()) {
         long $$0 = this.aP() + 1L;
         $$1 = (float)avj.a / (float)$$0;
      } else {
         $$1 = this.az.f();
      }

      int $$3 = 300;
      return Math.max(100, (int)($$1 * 300.0F));
   }

   public void B() {
      int $$0 = this.bn();
      if ($$0 < this.V) {
         this.V = $$0;
      }
   }

   protected void a(long $$0) {
   }

   private age bo() {
      age.b $$0 = this.bx();
      return new age(vd.a(this.aa), Optional.of($$0), Optional.of(age.c.a()), Optional.ofNullable(this.K), this.ay());
   }

   private age.b bx() {
      List<ana> $$0 = this.R.t();
      int $$1 = this.K();
      if (this.al()) {
         return new age.b($$1, $$0.size(), List.of());
      } else {
         int $$2 = Math.min($$0.size(), 12);
         ObjectArrayList<GameProfile> $$3 = new ObjectArrayList($$2);
         int $$4 = aui.a(this.L, 0, $$0.size() - $$2);

         for (int $$5 = 0; $$5 < $$2; $$5++) {
            ana $$6 = $$0.get($$4 + $$5);
            $$3.add($$6.Z() ? $$6.fR() : f);
         }

         ac.c($$3, this.L);
         return new age.b($$1, $$0.size(), $$3);
      }
   }

   public void b(BooleanSupplier $$0) {
      this.ae().t().forEach($$0x -> $$0x.c.g());
      this.B.a("commandFunctions");
      this.aC().b();
      this.B.b("levels");

      for (amz $$1 : this.H()) {
         this.B.a(() -> $$1 + " " + $$1.ae().a());
         if (this.U % 20 == 0) {
            this.B.a("timeSync");
            this.b($$1);
            this.B.c();
         }

         this.B.a("tick");

         try {
            $$1.a($$0);
         } catch (Throwable var6) {
            o $$3 = o.a(var6, "Exception ticking world");
            $$1.a($$3);
            throw new y($$3);
         }

         this.B.c();
         this.B.c();
      }

      this.B.b("connection");
      this.af().c();
      this.B.b("players");
      this.R.d();
      if (aa.aW && this.az.i()) {
         rs.a.b();
      }

      this.B.b("server gui refresh");

      for (int $$4 = 0; $$4 < this.z.size(); $$4++) {
         this.z.get($$4).run();
      }

      this.B.b("send chunks");

      for (ana $$5 : this.R.t()) {
         $$5.c.f.a($$5);
         $$5.c.h();
      }

      this.B.c();
   }

   private void b(amz $$0) {
      this.R.a(new acl($$0.X(), $$0.Y(), $$0.Z().b(cte.l)), $$0.ae());
   }

   public void C() {
      this.B.a("timeSync");

      for (amz $$0 : this.H()) {
         this.b($$0);
      }

      this.B.c();
   }

   public boolean D() {
      return true;
   }

   public void b(Runnable $$0) {
      this.z.add($$0);
   }

   protected void b(String $$0) {
      this.aw = $$0;
   }

   public boolean E() {
      return !this.ak.isAlive();
   }

   public File c(String $$0) {
      return new File(this.z(), $$0);
   }

   public final amz F() {
      return this.Q.get(cti.h);
   }

   @Nullable
   public amz a(ahc<cti> $$0) {
      return this.Q.get($$0);
   }

   public Set<ahc<cti>> G() {
      return this.Q.keySet();
   }

   public Iterable<amz> H() {
      return this.Q.values();
   }

   @Override
   public String I() {
      return aa.b().c();
   }

   @Override
   public int J() {
      return this.R.m();
   }

   @Override
   public int K() {
      return this.R.n();
   }

   public String[] L() {
      return this.R.e();
   }

   @DontObfuscate
   public String getServerModName() {
      return "vanilla";
   }

   public ab b(ab $$0) {
      $$0.a("Server Running", () -> Boolean.toString(this.S));
      if (this.R != null) {
         $$0.a("Player Count", () -> this.R.m() + " / " + this.R.n() + "; " + this.R.t());
      }

      $$0.a("Data Packs", () -> this.ao.f().stream().map($$0x -> $$0x.f() + ($$0x.c().a() ? "" : " (incompatible)")).collect(Collectors.joining(", ")));
      $$0.a("Enabled Feature Flags", () -> chn.e.b(this.k.M()).stream().map(ahd::toString).collect(Collectors.joining(", ")));
      $$0.a("World Generation", () -> this.k.D().toString());
      if (this.aw != null) {
         $$0.a("Server Id", () -> this.aw);
      }

      return this.a($$0);
   }

   public abstract ab a(ab var1);

   public auh M() {
      return auh.a("vanilla", this::getServerModName, "Server", MinecraftServer.class);
   }

   @Override
   public void a(vd $$0) {
      l.info($$0.getString());
   }

   public KeyPair N() {
      return this.ae;
   }

   public int O() {
      return this.O;
   }

   public void a(int $$0) {
      this.O = $$0;
   }

   @Nullable
   public GameProfile P() {
      return this.af;
   }

   public void b(@Nullable GameProfile $$0) {
      this.af = $$0;
   }

   public boolean Q() {
      return this.af != null;
   }

   protected void R() {
      l.info("Generating keypair");

      try {
         this.ae = atg.b();
      } catch (ath var2) {
         throw new IllegalStateException("Failed to generate key pair", var2);
      }
   }

   public void a(bjs $$0, boolean $$1) {
      if ($$1 || !this.k.t()) {
         this.k.a(this.k.n() ? bjs.d : $$0);
         this.by();
         this.ae().t().forEach(this::c);
      }
   }

   public int b(int $$0) {
      return $$0;
   }

   private void by() {
      for (amz $$0 : this.H()) {
         $$0.b(this.S(), this.Y());
      }
   }

   public void b(boolean $$0) {
      this.k.d($$0);
      this.ae().t().forEach(this::c);
   }

   private void c(ana $$0) {
      egb $$1 = $$0.dM().B_();
      $$0.c.b(new zj($$1.s(), $$1.t()));
   }

   public boolean S() {
      return this.k.s() != bjs.a;
   }

   public boolean T() {
      return this.ag;
   }

   public void c(boolean $$0) {
      this.ag = $$0;
   }

   public Optional<MinecraftServer.b> U() {
      return Optional.empty();
   }

   public boolean V() {
      return this.U().filter(MinecraftServer.b::c).isPresent();
   }

   public abstract boolean l();

   public abstract int m();

   public boolean W() {
      return this.W;
   }

   public void d(boolean $$0) {
      this.W = $$0;
   }

   public boolean X() {
      return this.X;
   }

   public void e(boolean $$0) {
      this.X = $$0;
   }

   public boolean Y() {
      return true;
   }

   public boolean Z() {
      return true;
   }

   public abstract boolean n();

   public boolean aa() {
      return this.Y;
   }

   public void f(boolean $$0) {
      this.Y = $$0;
   }

   public boolean ab() {
      return this.Z;
   }

   public void g(boolean $$0) {
      this.Z = $$0;
   }

   public abstract boolean o();

   @Override
   public String ac() {
      return this.aa;
   }

   public void d(String $$0) {
      this.aa = $$0;
   }

   public boolean ad() {
      return this.T;
   }

   public aqp ae() {
      return this.R;
   }

   public void a(aqp $$0) {
      this.R = $$0;
   }

   public abstract boolean p();

   public void a(ctf $$0) {
      this.k.a($$0);
   }

   public anx af() {
      return this.H;
   }

   public boolean ag() {
      return this.ah;
   }

   public boolean ah() {
      return false;
   }

   public boolean a(@Nullable ctf $$0, boolean $$1, int $$2) {
      return false;
   }

   public int ai() {
      return this.U;
   }

   public int aj() {
      return 16;
   }

   public boolean a(amz $$0, hx $$1, cfb $$2) {
      return false;
   }

   public boolean ak() {
      return true;
   }

   public boolean al() {
      return false;
   }

   public Proxy am() {
      return this.i;
   }

   public int an() {
      return this.ab;
   }

   public void c(int $$0) {
      this.ab = $$0;
   }

   public MinecraftSessionService ao() {
      return this.j.b();
   }

   @Nullable
   public auv ap() {
      return this.j.a();
   }

   public GameProfileRepository aq() {
      return this.j.d();
   }

   @Nullable
   public aql ar() {
      return this.j.e();
   }

   @Nullable
   public age as() {
      return this.J;
   }

   public void at() {
      this.aj = 0L;
   }

   public int au() {
      return 29999984;
   }

   @Override
   public boolean av() {
      return super.av() && !this.ad();
   }

   @Override
   public void c(Runnable $$0) {
      if (this.ad()) {
         throw new RejectedExecutionException("Server already shutting down");
      } else {
         super.c($$0);
      }
   }

   @Override
   public Thread aw() {
      return this.ak;
   }

   public int ax() {
      return 256;
   }

   public boolean ay() {
      return false;
   }

   public long az() {
      return this.al;
   }

   public DataFixer aA() {
      return this.M;
   }

   public int a(@Nullable amz $$0) {
      return $$0 != null ? $$0.Z().c(cte.s) : 10;
   }

   public ahp aB() {
      return this.ax.b.e();
   }

   public ahr aC() {
      return this.as;
   }

   public CompletableFuture<Void> a(Collection<String> $$0) {
      iu.b $$1 = this.P.b(ahm.d);
      CompletableFuture<Void> $$2 = CompletableFuture.<ImmutableList>supplyAsync(
            () -> $$0.stream().map(this.ao::c).filter(Objects::nonNull).map(apk::e).collect(ImmutableList.toImmutableList()), this
         )
         .thenCompose($$1x -> {
            aps $$2x = new apv(aor.b, $$1x);
            return ahn.a($$2x, $$1, this.k.M(), this.l() ? dt.a.b : dt.a.c, this.j(), this.av, this).whenComplete(($$1xx, $$2xx) -> {
               if ($$2xx != null) {
                  $$2x.close();
               }
            }).thenApply($$1xx -> new MinecraftServer.a($$2x, $$1xx));
         })
         .thenAcceptAsync($$1x -> {
            this.ax.close();
            this.ax = $$1x;
            this.ao.a($$0);
            cuc $$2x = new cuc(a(this.ao), this.k.M());
            this.k.a($$2x);
            this.ax.b.a(this.aZ());
            this.ae().h();
            this.ae().u();
            this.as.a(this.ax.b.a());
            this.ay.a(this.ax.a);
         }, this);
      if (this.bq()) {
         this.c($$2::isDone);
      }

      return $$2;
   }

   public static cuc a(apn $$0, csw $$1, boolean $$2, chl $$3) {
      $$0.a();
      if ($$2) {
         $$0.a(Collections.singleton("vanilla"));
         return cuc.c;
      } else {
         Set<String> $$4 = Sets.newLinkedHashSet();

         for (String $$5 : $$1.a()) {
            if ($$0.d($$5)) {
               $$4.add($$5);
            } else {
               l.warn("Missing data pack {}", $$5);
            }
         }

         for (apk $$6 : $$0.c()) {
            String $$7 = $$6.f();
            if (!$$1.b().contains($$7)) {
               chl $$8 = $$6.d();
               boolean $$9 = $$4.contains($$7);
               if (!$$9 && $$6.j().a()) {
                  if ($$8.a($$3)) {
                     l.info("Found new data pack {}, loading it automatically", $$7);
                     $$4.add($$7);
                  } else {
                     l.info("Found new data pack {}, but can't load it due to missing features {}", $$7, chn.a($$3, $$8));
                  }
               }

               if ($$9 && !$$8.a($$3)) {
                  l.warn("Pack {} requires features {} that are not enabled for this world, disabling pack.", $$7, chn.a($$3, $$8));
                  $$4.remove($$7);
               }
            }
         }

         if ($$4.isEmpty()) {
            l.info("No datapacks selected, forcing vanilla");
            $$4.add("vanilla");
         }

         $$0.a($$4);
         csw $$10 = a($$0);
         chl $$11 = $$0.e();
         return new cuc($$10, $$11);
      }
   }

   private static csw a(apn $$0) {
      Collection<String> $$1 = $$0.d();
      List<String> $$2 = ImmutableList.copyOf($$1);
      List<String> $$3 = $$0.b().stream().filter($$1x -> !$$1.contains($$1x)).collect(ImmutableList.toImmutableList());
      return new csw($$2, $$3);
   }

   public void a(ds $$0) {
      if (this.aM()) {
         aqp $$1 = $$0.l().ae();
         aqx $$2 = $$1.i();

         for (ana $$4 : Lists.newArrayList($$1.t())) {
            if (!$$2.a($$4.fR())) {
               $$4.c.b(vd.c("multiplayer.disconnect.not_whitelisted"));
            }
         }
      }
   }

   public apn aD() {
      return this.ao;
   }

   public dt aE() {
      return this.ax.b.d();
   }

   public ds aF() {
      amz $$0 = this.F();
      return new ds(this, $$0 == null ? elm.b : elm.a($$0.T()), ell.a, $$0, 4, "Server", vd.b("Server"), this, null);
   }

   @Override
   public boolean l_() {
      return true;
   }

   @Override
   public boolean x_() {
      return true;
   }

   @Override
   public abstract boolean W_();

   public cpy aG() {
      return this.ax.b.c();
   }

   public ahu aH() {
      return this.ap;
   }

   public efx aI() {
      if (this.aq == null) {
         throw new NullPointerException("Called before server init");
      } else {
         return this.aq;
      }
   }

   public egs aJ() {
      return this.ax.b.b();
   }

   public cte aK() {
      return this.F().Z();
   }

   public aid aL() {
      return this.ar;
   }

   public boolean aM() {
      return this.at;
   }

   public void h(boolean $$0) {
      this.at = $$0;
   }

   public float aN() {
      return this.au;
   }

   public ahv aO() {
      return this.az;
   }

   public long aP() {
      return this.ad / (long)Math.min(100, Math.max(this.U, 1));
   }

   public long[] aQ() {
      return this.ac;
   }

   public int c(GameProfile $$0) {
      if (this.ae().f($$0)) {
         aqr $$1 = this.ae().k().b($$0);
         if ($$1 != null) {
            return $$1.a();
         } else if (this.a($$0)) {
            return 4;
         } else if (this.Q()) {
            return this.ae().v() ? 4 : 0;
         } else {
            return this.i();
         }
      } else {
         return 0;
      }
   }

   public bgm aR() {
      return this.B;
   }

   public abstract boolean a(GameProfile var1);

   public void a(Path $$0) throws IOException {
   }

   private void b(Path $$0) {
      Path $$1 = $$0.resolve("levels");

      try {
         for (Entry<ahc<cti>, amz> $$2 : this.Q.entrySet()) {
            ahd $$3 = $$2.getKey().a();
            Path $$4 = $$1.resolve($$3.b()).resolve($$3.a());
            Files.createDirectories($$4);
            $$2.getValue().a($$4);
         }

         this.d($$0.resolve("gamerules.txt"));
         this.e($$0.resolve("classpath.txt"));
         this.c($$0.resolve("stats.txt"));
         this.f($$0.resolve("threads.txt"));
         this.a($$0.resolve("server.properties.txt"));
         this.g($$0.resolve("modules.txt"));
      } catch (IOException var7) {
         l.warn("Failed to save debug report", var7);
      }
   }

   private void c(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         $$1.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.br()));
         $$1.write(String.format(Locale.ROOT, "average_tick_time: %f\n", this.aN()));
         $$1.write(String.format(Locale.ROOT, "tick_times: %s\n", Arrays.toString(this.ac)));
         $$1.write(String.format(Locale.ROOT, "queue: %s\n", ac.f()));
      }
   }

   private void d(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         final List<String> $$2 = Lists.newArrayList();
         final cte $$3 = this.aK();
         cte.a(new cte.c() {
            @Override
            public <T extends cte.g<T>> void a(cte.e<T> $$0, cte.f<T> $$1) {
               $$2.add(String.format(Locale.ROOT, "%s=%s\n", $$0.a(), $$3.a($$0)));
            }
         });

         for (String $$4 : $$2) {
            $$1.write($$4);
         }
      }
   }

   private void e(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         String $$2 = System.getProperty("java.class.path");
         String $$3 = System.getProperty("path.separator");

         for (String $$4 : Splitter.on($$3).split($$2)) {
            $$1.write($$4);
            $$1.write("\n");
         }
      }
   }

   private void f(Path $$0) throws IOException {
      ThreadMXBean $$1 = ManagementFactory.getThreadMXBean();
      ThreadInfo[] $$2 = $$1.dumpAllThreads(true, true);
      Arrays.sort($$2, Comparator.comparing(ThreadInfo::getThreadName));

      try (Writer $$3 = Files.newBufferedWriter($$0)) {
         for (ThreadInfo $$4 : $$2) {
            $$3.write($$4.toString());
            $$3.write(10);
         }
      }
   }

   private void g(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         List<auj.a> $$2;
         try {
            $$2 = Lists.newArrayList(auj.a());
         } catch (Throwable var7) {
            l.warn("Failed to list native modules", var7);
            return;
         }

         $$2.sort(Comparator.comparing($$0x -> $$0x.a));

         for (auj.a $$5 : $$2) {
            $$1.write($$5.toString());
            $$1.write(10);
         }
      }
   }

   private void bz() {
      if (this.E) {
         this.A = bhv.a(new bhz(ac.b, this.l()), ac.b, ac.g(), new bib("server"), this.C, $$0 -> {
            this.h(() -> this.b($$0.resolve("server")));
            this.D.accept($$0);
         });
         this.E = false;
      }

      this.B = bgp.a(this.A.f(), bgp.a("Server"));
      this.A.c();
      this.B.a();
   }

   private void bA() {
      this.B.b();
      this.A.d();
   }

   public boolean aS() {
      return this.A.e();
   }

   public void a(Consumer<bgl> $$0, Consumer<Path> $$1) {
      this.C = $$1x -> {
         this.aT();
         $$0.accept($$1x);
      };
      this.D = $$1;
      this.E = true;
   }

   public void aT() {
      this.A = bhw.a;
   }

   public void aU() {
      this.A.a();
   }

   public void aV() {
      this.A.b();
      this.B = this.A.f();
   }

   public Path a(egd $$0) {
      return this.g.a($$0);
   }

   public boolean aW() {
      return true;
   }

   public eda aX() {
      return this.ay;
   }

   public egl aY() {
      return this.k;
   }

   public iu.b aZ() {
      return this.P.a();
   }

   public io<ahm> ba() {
      return this.P;
   }

   public aod a(ana $$0) {
      return aod.a;
   }

   public anb b(ana $$0) {
      return (anb)(this.T() ? new amq($$0) : new anb($$0));
   }

   @Nullable
   public ctf bb() {
      return null;
   }

   public aqc bc() {
      return this.ax.a;
   }

   public boolean bd() {
      return this.aA;
   }

   public boolean be() {
      return this.G || this.F != null;
   }

   public void bf() {
      this.G = true;
   }

   public bgl bg() {
      if (this.F == null) {
         return bgh.a;
      } else {
         bgl $$0 = this.F.a(ac.c(), this.U);
         this.F = null;
         return $$0;
      }
   }

   public int bh() {
      return 1000000;
   }

   public void a(vd $$0, uz.a $$1, @Nullable String $$2) {
      String $$3 = $$1.a($$0).getString();
      if ($$2 != null) {
         l.info("[{}] {}", $$2, $$3);
      } else {
         l.info("{}", $$3);
      }
   }

   public uy bi() {
      return uy.a;
   }

   public boolean bj() {
      return true;
   }

   static record a(aps a, ahn b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.close();
      }
   }

   public static record b(String a, String b, boolean c, @Nullable vd d) {
   }

   static class c {
      final long a;
      final int b;

      c(long $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      bgl a(final long $$0, final int $$1) {
         return new bgl() {
            @Override
            public List<bgo> a(String $$0x) {
               return Collections.emptyList();
            }

            @Override
            public boolean a(Path $$0x) {
               return false;
            }

            @Override
            public long a() {
               return c.this.a;
            }

            @Override
            public int b() {
               return c.this.b;
            }

            @Override
            public long c() {
               return $$0;
            }

            @Override
            public int d() {
               return $$1;
            }

            @Override
            public String e() {
               return "";
            }
         };
      }
   }
}
