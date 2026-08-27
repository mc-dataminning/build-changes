import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record vb(vc j, vc k) {
   public static final Codec<vb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(vc.a.fieldOf("chat").forGetter(vb::a), vc.a.fieldOf("narration").forGetter(vb::b)).apply($$0, vb::new)
   );
   public static final vc b = vc.a("chat.type.text");
   public static final ahf<vb> c = a("chat");
   public static final ahf<vb> d = a("say_command");
   public static final ahf<vb> e = a("msg_command_incoming");
   public static final ahf<vb> f = a("msg_command_outgoing");
   public static final ahf<vb> g = a("team_msg_command_incoming");
   public static final ahf<vb> h = a("team_msg_command_outgoing");
   public static final ahf<vb> i = a("emote_command");

   private static ahf<vb> a(String $$0) {
      return ahf.a(ke.au, new ahg($$0));
   }

   public static void a(pe<vb> $$0) {
      $$0.a(c, new vb(b, vc.a("chat.type.text.narrate")));
      $$0.a(d, new vb(vc.a("chat.type.announcement"), vc.a("chat.type.text.narrate")));
      $$0.a(e, new vb(vc.b("commands.message.display.incoming"), vc.a("chat.type.text.narrate")));
      $$0.a(f, new vb(vc.c("commands.message.display.outgoing"), vc.a("chat.type.text.narrate")));
      $$0.a(g, new vb(vc.d("chat.type.team.text"), vc.a("chat.type.text.narrate")));
      $$0.a(h, new vb(vc.d("chat.type.team.sent"), vc.a("chat.type.text.narrate")));
      $$0.a(i, new vb(vc.a("chat.type.emote"), vc.a("chat.type.emote")));
   }

   public static vb.a a(ahf<vb> $$0, blv $$1) {
      return a($$0, $$1.dM().I_(), $$1.Q_());
   }

   public static vb.a a(ahf<vb> $$0, ds $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static vb.a a(ahf<vb> $$0, iu $$1, vf $$2) {
      it<vb> $$3 = $$1.d(ke.au);
      return $$3.e($$0).a($$2);
   }

   public vb.a a(vf $$0) {
      return new vb.a(this, $$0);
   }

   public vc a() {
      return this.j;
   }

   public vc b() {
      return this.k;
   }

   public static record a(vb a, vf b, @Nullable vf c) {
      a(vb $$0, vf $$1) {
         this($$0, $$1, null);
      }

      public vf a(vf $$0) {
         return this.a.a().a($$0, this);
      }

      public vf b(vf $$0) {
         return this.a.b().a($$0, this);
      }

      public vb.a c(vf $$0) {
         return new vb.a(this.a, this.b, $$0);
      }

      public vb.b a(iu $$0) {
         it<vb> $$1 = $$0.d(ke.au);
         return new vb.b($$1.a(this.a), this.b, this.c);
      }
   }

   public static record b(int a, vf b, @Nullable vf c) {
      public b(ui $$0) {
         this($$0.n(), $$0.m(), $$0.c(ui::m));
      }

      public void a(ui $$0) {
         $$0.c(this.a);
         $$0.a(this.b);
         $$0.a(this.c, ui::a);
      }

      public Optional<vb.a> a(iu $$0) {
         it<vb> $$1 = $$0.d(ke.au);
         vb $$2 = $$1.a(this.a);
         return Optional.ofNullable($$2).map($$0x -> new vb.a($$0x, this.b, this.c));
      }
   }
}
