import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record ue(uf j, uf k) {
   public static final Codec<ue> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(uf.a.fieldOf("chat").forGetter(ue::a), uf.a.fieldOf("narration").forGetter(ue::b)).apply($$0, ue::new)
   );
   public static final uf b = uf.a("chat.type.text");
   public static final afv<ue> c = a("chat");
   public static final afv<ue> d = a("say_command");
   public static final afv<ue> e = a("msg_command_incoming");
   public static final afv<ue> f = a("msg_command_outgoing");
   public static final afv<ue> g = a("team_msg_command_incoming");
   public static final afv<ue> h = a("team_msg_command_outgoing");
   public static final afv<ue> i = a("emote_command");

   private static afv<ue> a(String $$0) {
      return afv.a(jz.ar, new afw($$0));
   }

   public static void a(oo<ue> $$0) {
      $$0.a(c, new ue(b, uf.a("chat.type.text.narrate")));
      $$0.a(d, new ue(uf.a("chat.type.announcement"), uf.a("chat.type.text.narrate")));
      $$0.a(e, new ue(uf.b("commands.message.display.incoming"), uf.a("chat.type.text.narrate")));
      $$0.a(f, new ue(uf.c("commands.message.display.outgoing"), uf.a("chat.type.text.narrate")));
      $$0.a(g, new ue(uf.d("chat.type.team.text"), uf.a("chat.type.text.narrate")));
      $$0.a(h, new ue(uf.d("chat.type.team.sent"), uf.a("chat.type.text.narrate")));
      $$0.a(i, new ue(uf.a("chat.type.emote"), uf.a("chat.type.emote")));
   }

   public static ue.a a(afv<ue> $$0, bjt $$1) {
      return a($$0, $$1.dL().H_(), $$1.O_());
   }

   public static ue.a a(afv<ue> $$0, du $$1) {
      return a($$0, $$1.v(), $$1.c());
   }

   public static ue.a a(afv<ue> $$0, ip $$1, ui $$2) {
      io<ue> $$3 = $$1.d(jz.ar);
      return $$3.e($$0).a($$2);
   }

   public ue.a a(ui $$0) {
      return new ue.a(this, $$0);
   }

   public uf a() {
      return this.j;
   }

   public uf b() {
      return this.k;
   }

   public static record a(ue a, ui b, @Nullable ui c) {
      a(ue $$0, ui $$1) {
         this($$0, $$1, null);
      }

      public ui a(ui $$0) {
         return this.a.a().a($$0, this);
      }

      public ui b(ui $$0) {
         return this.a.b().a($$0, this);
      }

      public ue.a c(ui $$0) {
         return new ue.a(this.a, this.b, $$0);
      }

      public ue.b a(ip $$0) {
         io<ue> $$1 = $$0.d(jz.ar);
         return new ue.b($$1.a(this.a), this.b, this.c);
      }
   }

   public static record b(int a, ui b, @Nullable ui c) {
      public b(tl $$0) {
         this($$0.n(), $$0.m(), $$0.c(tl::m));
      }

      public void a(tl $$0) {
         $$0.c(this.a);
         $$0.a(this.b);
         $$0.a(this.c, tl::a);
      }

      public Optional<ue.a> a(ip $$0) {
         io<ue> $$1 = $$0.d(jz.ar);
         ue $$2 = $$1.a(this.a);
         return Optional.ofNullable($$2).map($$0x -> new ue.a($$0x, this.b, this.c));
      }
   }
}
